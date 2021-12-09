package samples

import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.runBlocking
import org.assertj.core.api.Assertions
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import samples.coroutine.ContentDuration
import samples.coroutine.DummyService
import java.time.Duration
import java.time.Instant

open class CoroutineTest {
    private lateinit var services: Array<String>
    private lateinit var lambdas: List<DummyService>

    @BeforeMethod
    protected fun setUp() {
        services = arrayOf("Service A", "Service B", "Service C", "Service X", "Service Y", "Service Z")
        lambdas = services.map { DummyService(it) }
    }

    @Test
    fun should_be_parallel2() = runBlocking {
        val start = Instant.now()
        val results = lambdas.map {
            async {
                println(it.content)
                it.content
            }
        }
        val end = Instant.now()
        results.forEach(::println)
        Assertions.assertThat(results).isNotNull.isNotEmpty.hasSameSizeAs(services)

        val maxTimeElapsed = results.awaitAll().map { (_, duration) -> duration }.max()
        println("Time taken by the longest service is  $maxTimeElapsed milliseconds")
        val duration = Duration.between(start, end)
        val timeElapsed = duration.toMillis()
        println("Time taken by the executor service is $timeElapsed milliseconds")
    }


}