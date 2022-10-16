# Generating Project Using Maven

### Using Maven

We will be using Maven QuickStart Archetype.

```
project
|-- pom.xml
`-- src
    |-- main
    |   `-- java
    |       `-- $package
    |           `-- App.java
    `-- test
        `-- java
            `-- $package
                `-- AppTest.java
```

To generate this archetype, command:

```bash
mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4
```

It will create application in interactive mode where you will define:

1. groupId : full package namespace of your application
2. artifactId : app name
3. version : application version