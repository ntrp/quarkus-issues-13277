# quarkus-issues-13277
Steps to reproduce:
- start the server in the server folder with `mvn spring-boot:run`
- start the client in the client folder with `mvn quarkus:dev`

To check the properties coming from the config server:
`curl http://localhost:8889/client/dev`
