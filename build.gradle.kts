buildscript {
    var kotlinVersion:String by extra
    kotlinVersion = file("kotlin-version.txt").readText().trim()
    repositories {
        gradleScriptKotlin()
        maven { setUrl("http://maven.aliyun.com/nexus/content/groups/public/") }
    }
    dependencies{
        classpath(kotlinModule("gradle-plugin",kotlinVersion))
    }
}


apply{
    plugin("kotlin")
    plugin("java")
}

repositories{
    gradleScriptKotlin()
    maven { setUrl("http://maven.aliyun.com/nexus/content/groups/public/") }
}

dependencies{
    compile(kotlinModule("stdlib"))
    compile("junit:junit:4.12")
}