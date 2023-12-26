/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.dynamicrouter.routing;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DynamicRouterEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DynamicRouterEndpoint target = (DynamicRouterEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "aggregationstrategy":
        case "aggregationStrategy": target.getConfiguration().setAggregationStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "aggregationstrategybean":
        case "aggregationStrategyBean": target.getConfiguration().setAggregationStrategyBean(property(camelContext, org.apache.camel.AggregationStrategy.class, value)); return true;
        case "aggregationstrategymethodallownull":
        case "aggregationStrategyMethodAllowNull": target.getConfiguration().setAggregationStrategyMethodAllowNull(property(camelContext, boolean.class, value)); return true;
        case "aggregationstrategymethodname":
        case "aggregationStrategyMethodName": target.getConfiguration().setAggregationStrategyMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "cachesize":
        case "cacheSize": target.getConfiguration().setCacheSize(property(camelContext, int.class, value)); return true;
        case "executorservice":
        case "executorService": target.getConfiguration().setExecutorService(property(camelContext, java.lang.String.class, value)); return true;
        case "executorservicebean":
        case "executorServiceBean": target.getConfiguration().setExecutorServiceBean(property(camelContext, java.util.concurrent.ExecutorService.class, value)); return true;
        case "ignoreinvalidendpoints":
        case "ignoreInvalidEndpoints": target.getConfiguration().setIgnoreInvalidEndpoints(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "onprepare":
        case "onPrepare": target.getConfiguration().setOnPrepare(property(camelContext, java.lang.String.class, value)); return true;
        case "onprepareprocessor":
        case "onPrepareProcessor": target.getConfiguration().setOnPrepareProcessor(property(camelContext, org.apache.camel.Processor.class, value)); return true;
        case "parallelaggregate":
        case "parallelAggregate": target.getConfiguration().setParallelAggregate(property(camelContext, boolean.class, value)); return true;
        case "parallelprocessing":
        case "parallelProcessing": target.getConfiguration().setParallelProcessing(property(camelContext, boolean.class, value)); return true;
        case "recipientmode":
        case "recipientMode": target.getConfiguration().setRecipientMode(property(camelContext, java.lang.String.class, value)); return true;
        case "shareunitofwork":
        case "shareUnitOfWork": target.getConfiguration().setShareUnitOfWork(property(camelContext, boolean.class, value)); return true;
        case "stoponexception":
        case "stopOnException": target.getConfiguration().setStopOnException(property(camelContext, boolean.class, value)); return true;
        case "streaming": target.getConfiguration().setStreaming(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.getConfiguration().setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeout": target.getConfiguration().setTimeout(property(camelContext, long.class, value)); return true;
        case "warndroppedmessage":
        case "warnDroppedMessage": target.getConfiguration().setWarnDroppedMessage(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "aggregationstrategy":
        case "aggregationStrategy": return java.lang.String.class;
        case "aggregationstrategybean":
        case "aggregationStrategyBean": return org.apache.camel.AggregationStrategy.class;
        case "aggregationstrategymethodallownull":
        case "aggregationStrategyMethodAllowNull": return boolean.class;
        case "aggregationstrategymethodname":
        case "aggregationStrategyMethodName": return java.lang.String.class;
        case "cachesize":
        case "cacheSize": return int.class;
        case "executorservice":
        case "executorService": return java.lang.String.class;
        case "executorservicebean":
        case "executorServiceBean": return java.util.concurrent.ExecutorService.class;
        case "ignoreinvalidendpoints":
        case "ignoreInvalidEndpoints": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "onprepare":
        case "onPrepare": return java.lang.String.class;
        case "onprepareprocessor":
        case "onPrepareProcessor": return org.apache.camel.Processor.class;
        case "parallelaggregate":
        case "parallelAggregate": return boolean.class;
        case "parallelprocessing":
        case "parallelProcessing": return boolean.class;
        case "recipientmode":
        case "recipientMode": return java.lang.String.class;
        case "shareunitofwork":
        case "shareUnitOfWork": return boolean.class;
        case "stoponexception":
        case "stopOnException": return boolean.class;
        case "streaming": return boolean.class;
        case "synchronous": return boolean.class;
        case "timeout": return long.class;
        case "warndroppedmessage":
        case "warnDroppedMessage": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DynamicRouterEndpoint target = (DynamicRouterEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "aggregationstrategy":
        case "aggregationStrategy": return target.getConfiguration().getAggregationStrategy();
        case "aggregationstrategybean":
        case "aggregationStrategyBean": return target.getConfiguration().getAggregationStrategyBean();
        case "aggregationstrategymethodallownull":
        case "aggregationStrategyMethodAllowNull": return target.getConfiguration().isAggregationStrategyMethodAllowNull();
        case "aggregationstrategymethodname":
        case "aggregationStrategyMethodName": return target.getConfiguration().getAggregationStrategyMethodName();
        case "cachesize":
        case "cacheSize": return target.getConfiguration().getCacheSize();
        case "executorservice":
        case "executorService": return target.getConfiguration().getExecutorService();
        case "executorservicebean":
        case "executorServiceBean": return target.getConfiguration().getExecutorServiceBean();
        case "ignoreinvalidendpoints":
        case "ignoreInvalidEndpoints": return target.getConfiguration().isIgnoreInvalidEndpoints();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "onprepare":
        case "onPrepare": return target.getConfiguration().getOnPrepare();
        case "onprepareprocessor":
        case "onPrepareProcessor": return target.getConfiguration().getOnPrepareProcessor();
        case "parallelaggregate":
        case "parallelAggregate": return target.getConfiguration().isParallelAggregate();
        case "parallelprocessing":
        case "parallelProcessing": return target.getConfiguration().isParallelProcessing();
        case "recipientmode":
        case "recipientMode": return target.getConfiguration().getRecipientMode();
        case "shareunitofwork":
        case "shareUnitOfWork": return target.getConfiguration().isShareUnitOfWork();
        case "stoponexception":
        case "stopOnException": return target.getConfiguration().isStopOnException();
        case "streaming": return target.getConfiguration().isStreaming();
        case "synchronous": return target.getConfiguration().isSynchronous();
        case "timeout": return target.getConfiguration().getTimeout();
        case "warndroppedmessage":
        case "warnDroppedMessage": return target.getConfiguration().isWarnDroppedMessage();
        default: return null;
        }
    }
}
