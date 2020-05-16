# Flyway

## Adding SQL files
```
docker run --rm -v /my/sqldir:/flyway/sql flyway/flyway:6.4.2-alpine -url=jdbc:h2:mem:test -user=sa migrate
```

