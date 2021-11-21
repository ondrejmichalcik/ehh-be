# ehh-be

## Setting up an IDE
https://docs.micronaut.io/latest/guide/index.html#ideSetup

##Setup local environment
Enter following configuration to ~/.m2/settings.xml
```
<settings>
  <profiles>
    <profile>
      <id>codenow</id>
      <repositories>
        <repository>
          <id>codenow-releases</id>
          <url>https://codenow.jfrog.io/artifactory/stxcn-maven-releases/</url>
        </repository>
      </repositories>
    </profile>
  </profiles>
  <servers>
    <server>
      <id>codenow-releases</id>
      <username>ENTER YOUR USERNAME HERE</username>
      <password><![CDATA[ENTER YOUR PASSWORD HERE]]></password>
    </server>
  </servers>
  <activeProfiles>
    <activeProfile>codenow</activeProfile>
  </activeProfiles>
</settings>
```

## Application runner
For IntelliJ IDEA there is a run configuration in `.run/Application.run.xml`.

Locally running application is configured through application.yaml located in `./codeno/config` directory. To override, use JVM options such as

```
-Dmicronaut.server.port=8080 -Dmicronaut.config.files=file:codenow/config/application.yaml 
```

## Deployment configuration
All files located in `./codenow/config` directory will be deployed alongside the application and available in `/codenow/config` directory

## Curl examples
```
curl -X GET  http://localhost:8080/hello-world 
```
