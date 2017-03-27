# kstream-meetup
A kstream script based on meetup open data

## Steps

### Installation

`git clone https://github.com/Wconti/kstream-meetup.git`

### Run

`java -cp target/kstream-meetup-1.0-SNAPSHOT.jar com.wconti.app.KstreamMeetup`


### Monitor on kafka console
```
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 \
  --topic testout \ 
  --formatter kafka.tools.DefaultMessageFormatter \
  --property print.key=true \
  --property key.deserializer=org.apache.kafka.common.serialization.StringDeserializer \
  --property value.deserializer=org.apache.kafka.common.serialization.LongDeserializer
```
