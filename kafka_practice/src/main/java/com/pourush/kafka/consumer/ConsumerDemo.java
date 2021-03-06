package com.pourush.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.protocol.types.Field;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

/**
 * Created by pourush.sinha on 11/05/19.
 */
public class ConsumerDemo {

    public static void main(String[] args) {
        String bootrstrapServers = "127.0.0.1:9092";
        String groupId = "my-fourth-application";
        String topic ="utsav_topic";
        Logger logger = LoggerFactory.getLogger(ConsumerDemo.class.getName());
        Properties properties = new Properties();
        properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,bootrstrapServers);
        properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"earliest");
        properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG,groupId);

        KafkaConsumer<String ,String> consumer = new KafkaConsumer<String, String>(properties);
        consumer.subscribe(Arrays.asList("utsav_topic"));

        while (true){
            ConsumerRecords<String ,String > records = consumer.poll(Duration.ofMillis(100));
            for(ConsumerRecord<String,String> record : records){
                System.out.println("Key :" +record.key() + " value: "+ record.value());
                System.out.println("Partition :" +record.partition() + " Offset: "+ record.offset());


            }
        }
    }
}
