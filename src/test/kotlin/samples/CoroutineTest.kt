package samples

import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import samples.coroutine.DummyService
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
    fun should_be_parallel() {
        val start = Instant.now()
        val end = Instant.now()
    }

}