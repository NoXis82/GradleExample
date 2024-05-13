import org.junit.jupiter.api.Test
import java.util.concurrent.TimeUnit


class ServiceTest {

    @Test
    @Throws(Exception::class)
    fun testConnection() {
        for (i in 0 until CONNECTION_TEST_ATTEMPTS) {
            println(
                "Connection Attempt " + (i + 1)
                        + "/" + CONNECTION_TEST_ATTEMPTS
            )
            Thread.sleep(TimeUnit.SECONDS.toMillis(1))
        }
    }

    companion object {
        const val CONNECTION_TEST_ATTEMPTS: Int = 20
    }

}