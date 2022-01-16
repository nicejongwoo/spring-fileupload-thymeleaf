# 파일업로드 데모 프로젝트

참고사이트
* dropzonejs - https://frontbackend.com/thymeleaf/spring-boot-bootstrap-thymeleaf-drop-file-area

## Skill Set
* H2 InMomory DB
* Spring Boot v2.6.2
* Spring Data JPA
* Thymeleaf

## Development Environment
* openjdk version "11.0.10" 2021-01-19 LTS
* node v17.2.0
* npm v8.1.4
* yarn 1.22.4
* IntelliJ Community 2021.1

## Run and Install

### Working Server in IntelliJ

#### Steps:

1) Command line
```
git clone 
```
2) IntelliJ
```
File -> Open -> pom.xml -> Open as Project
```
3) Run
```
SpringFileuploadThymeleafApplication.java.main() 실행 - (단축키: alt + f10)
```

4) Connection
```
http://localhost:8080/
```

### Build
* 빌드시 node 버전에 따른 에러 발생 시
    * Error: error:0308010C:digital envelope routines::unsupported
    * `yarn add react-script` 후 `mvn clean package`
```
mvn clean package
```

### Deploy

#### jar 파일로 빌드 시
```
cd todo-rs/target
java -jar drop-file-upload-0.0.1.jar
```
