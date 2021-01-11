object Deps {
    private val kotlin_version = "1.4.20"

    object Kotlin {
        val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version"
    }

    object Ktor {
        private val ktor_version = "1.4.2"
        private val logback_version = "1.2.1"

        val netty = "io.ktor:ktor-server-netty:$ktor_version"
        val logback = "ch.qos.logback:logback-classic:$logback_version"
        val core = "io.ktor:ktor-server-core:$ktor_version"
        val test = "io.ktor:ktor-server-tests:$ktor_version"
        val serialization = "io.ktor:ktor-serialization:$ktor_version"
    }

    object GraphQL {
        val graphQl = "com.graphql-java:graphql-java:16.1"
        val schemaGenerator = "com.expediagroup:graphql-kotlin-schema-generator:3.6.7"
    }

    object Koin {
        private val koin_version = "2.2.1"

        val ktor = "org.koin:koin-ktor:$koin_version"

        // Koin for Kotlin
        val core = "org.koin:koin-core:$koin_version"

        // Koin Extended & experimental features
        val coreExt = "org.koin:koin-core-ext:$koin_version"

        // Koin for Unit tests
        val test = "org.koin:koin-test:$koin_version"
    }

    object Test {
        private val mockk_version = "1.10.2"
        val mockk = "io.mockk:mockk:$mockk_version"
        val truth = "com.google.truth:truth:1.1"
    }

    object Spek {
        private val spek_version = "2.0.14"
        val spek = "org.spekframework.spek2:spek-dsl-jvm:$spek_version"
        val spekRunner = "org.spekframework.spek2:spek-runner-junit5:$spek_version" // testRuntimeOnly
        val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:$kotlin_version" // testRuntimeOnly
    }
}
