/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Increment, decrement, set, etc. Hazelcast atomic number (a grid wide number).
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface HazelcastAtomicnumberEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Hazelcast Atomic Number component.
     */
    public interface HazelcastAtomicnumberEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedHazelcastAtomicnumberEndpointBuilder advanced() {
            return (AdvancedHazelcastAtomicnumberEndpointBuilder) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.hazelcast.HazelcastOperation&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param defaultOperation the value to set
         * @return the dsl builder
         */
        default HazelcastAtomicnumberEndpointBuilder defaultOperation(
                org.apache.camel.component.hazelcast.HazelcastOperation defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.hazelcast.HazelcastOperation&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param defaultOperation the value to set
         * @return the dsl builder
         */
        default HazelcastAtomicnumberEndpointBuilder defaultOperation(
                String defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option is a:
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastAtomicnumberEndpointBuilder hazelcastInstance(
                com.hazelcast.core.HazelcastInstance hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastAtomicnumberEndpointBuilder hazelcastInstance(
                String hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param hazelcastInstanceName the value to set
         * @return the dsl builder
         */
        default HazelcastAtomicnumberEndpointBuilder hazelcastInstanceName(
                String hazelcastInstanceName) {
            doSetProperty("hazelcastInstanceName", hazelcastInstanceName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Hazelcast Atomic Number component.
     */
    public interface AdvancedHazelcastAtomicnumberEndpointBuilder
            extends
                EndpointProducerBuilder {
        default HazelcastAtomicnumberEndpointBuilder basic() {
            return (HazelcastAtomicnumberEndpointBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastAtomicnumberEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastAtomicnumberEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface HazelcastAtomicnumberBuilders {
        /**
         * Hazelcast Atomic Number (camel-hazelcast)
         * Increment, decrement, set, etc. Hazelcast atomic number (a grid wide
         * number).
         * 
         * Category: cache,clustering
         * Since: 2.7
         * Maven coordinates: org.apache.camel:camel-hazelcast
         * 
         * @return the dsl builder for the headers' name.
         */
        default HazelcastAtomicnumberHeaderNameBuilder hazelcastAtomicvalue() {
            return HazelcastAtomicnumberHeaderNameBuilder.INSTANCE;
        }
        /**
         * Hazelcast Atomic Number (camel-hazelcast)
         * Increment, decrement, set, etc. Hazelcast atomic number (a grid wide
         * number).
         * 
         * Category: cache,clustering
         * Since: 2.7
         * Maven coordinates: org.apache.camel:camel-hazelcast
         * 
         * Syntax: <code>hazelcast-atomicvalue:cacheName</code>
         * 
         * Path parameter: cacheName (required)
         * The name of the cache
         * 
         * @param path cacheName
         * @return the dsl builder
         */
        default HazelcastAtomicnumberEndpointBuilder hazelcastAtomicvalue(
                String path) {
            return HazelcastAtomicnumberEndpointBuilderFactory.endpointBuilder("hazelcast-atomicvalue", path);
        }
        /**
         * Hazelcast Atomic Number (camel-hazelcast)
         * Increment, decrement, set, etc. Hazelcast atomic number (a grid wide
         * number).
         * 
         * Category: cache,clustering
         * Since: 2.7
         * Maven coordinates: org.apache.camel:camel-hazelcast
         * 
         * Syntax: <code>hazelcast-atomicvalue:cacheName</code>
         * 
         * Path parameter: cacheName (required)
         * The name of the cache
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path cacheName
         * @return the dsl builder
         */
        default HazelcastAtomicnumberEndpointBuilder hazelcastAtomicvalue(
                String componentName,
                String path) {
            return HazelcastAtomicnumberEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Hazelcast Atomic Number component.
     */
    public static class HazelcastAtomicnumberHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final HazelcastAtomicnumberHeaderNameBuilder INSTANCE = new HazelcastAtomicnumberHeaderNameBuilder();

        /**
         * The operation to perform.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code HazelcastOperationType}.
         */
        public String hazelcastOperationType() {
            return "HazelcastOperationType";
        }
    }
    static HazelcastAtomicnumberEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class HazelcastAtomicnumberEndpointBuilderImpl extends AbstractEndpointBuilder implements HazelcastAtomicnumberEndpointBuilder, AdvancedHazelcastAtomicnumberEndpointBuilder {
            public HazelcastAtomicnumberEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new HazelcastAtomicnumberEndpointBuilderImpl(path);
    }
}