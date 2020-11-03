# DPE IEMIS

### Maven Build

Build the complete project

```bash
mvn clean package [-DskipTests]
```
	
Build specific project
	
```bash
mvn clean package --projects :<artifactId> [--also-make] [-DskipTests]
```
	
Run unit test
	
```bash
mvn test
```

Docker compose for dev environment with hot reload and remote-debugging support

```bash
docker-compose -f docker-compose.dev.yml --build [service-name]
```

Docker unused container and image prune

```bash
docker system prune
```
