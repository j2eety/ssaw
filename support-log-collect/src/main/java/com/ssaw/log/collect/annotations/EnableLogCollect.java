package com.ssaw.log.collect.annotations;

import com.ssaw.log.collect.config.KafkaProducerConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author HuSen
 * @date 2019/2/25 17:40
 */
@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(KafkaProducerConfig.class)
public @interface EnableLogCollect {}
