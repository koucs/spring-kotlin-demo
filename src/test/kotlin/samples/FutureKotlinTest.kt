package samples

import org.assertj.core.api.Assertions
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import samples.coroutine.ContentDuration
import samples.coroutine.DummyService
import java.time.Duration
import java.time.Instant
import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class FutureKotlinTest {
    private lateinit var executor: ExecutorService
    private lateinit var services: Array<String>
    private lateinit var callables: List<Callable<ContentDuration>>

    @BeforeMethod
    protected fun setUp() {
        executor = Executors.newWorkStealingPool()
        services = arrayOf("Service A", "Service B", "Service C", "Service X", "Service Y", "Service Z")
        callables = services
            .map { DummyService(it) }
            .map { Callable<ContentDuration> { it.content } }
    }

    @Test
    fun should_be_parallel() {
        val start = Instant.now()
        val results = executor.invokeAll(callables).map { it.get() }
        val end = Instant.now()

        results.forEach(::println)
        Assertions.assertThat(results).isNotNull.isNotEmpty.hasSameSizeAs(services)

        val maxTimeElapsed = results.map { (_, duration) -> duration }.max()
        println("Time taken by the longest service is  $maxTimeElapsed milliseconds")
        val duration = Duration.between(start, end)
        val timeElapsed = duration.toMillis()
        println("Time taken by the executor service is $timeElapsed milliseconds")
    }
}