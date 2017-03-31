buildscript {

    var kotlinVersion:String by extra
    kotlinVersion = "1.1.0"

    repositories {
        gradleScriptKotlin()
        maven {
            setUrl("http://maven.aliyun.com/nexus/content/groups/public/")
        }
        mavenCentral()
    }
    dependencies {
        classpath(kotlinModule("gradle-plugin", kotlinVersion))
        classpath(kotlinModule("allopen", kotlinVersion))
    }
}

apply {
    plugin("java")
    plugin("kotlin")
    plugin("scala")
}

repositories {
    gradleScriptKotlin()
    maven {
        setUrl("http://maven.aliyun.com/nexus/content/groups/public/")
    }
    mavenCentral()
}

dependencies {
    val kotlinVersion: String by extra

    // kotlin
    compile(kotlinModule("stdlib-jre8", kotlinVersion))


    // scala
    compile("org.scala-lang:scala-library:2.12.1")
    compile("org.scala-lang:scala-compiler:2.12.1")
    compile("org.scala-lang:scala-reflect:2.12.1")
    compile("org.scalactic:scalactic_2.12:3.0.1")
    compile("org.scalatest:scalatest_2.12:3.0.1")

    compile("junit:junit:4.12")
    compile("org.hamcrest:hamcrest-all:1.3")
    compile("com.natpryce:hamkrest:1.3.0.0")
    compile("org.mockito:mockito-core:2.4.5")
    compile("com.nhaarman:mockito-kotlin:1.1.0")
}