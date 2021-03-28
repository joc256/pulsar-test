import org.apache.pulsar.client.api.*

fun main(args: Array<String>) {
    println("Hello World!A?!")
    val client = PulsarClient.builder()
                              .serviceUrl("pulsar://localhost:6650")
                              .build();
}
