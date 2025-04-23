FROM hseeberger/scala-sbt:17.0.2_1.6.2_3.1.1

WORKDIR /app

COPY app /app/app
COPY conf /app/conf
COPY build.sbt /app/
COPY project /app/project

CMD ["sbt", "run"]
