# Log4j 2 Manual

### 配置说明
Log4j has the ability to automatically detect changes to the configuration file and reconfigure itself.

Log4j 自动检测文件顺序：
（1）从系统属性里面获取配置文件路径 ： log4j2.configurationFile，
（2）从classpath查找文件：log4j2-test.properties
（3） log4j2-test.yaml 或者  log4j2-test.yml
（4）log4j2-test.json 或者 log4j2-test.jsn
（5）log4j2-test.xml
（6）log4j2.properties
（7）log4j2.yaml 或 log4j2.yml
（8）log4j2.json 或 log4j2.jsn
（9）log4j2.xml
（10）以上都没找到时，DefaultConfiguration被使用，日志将被打到控制台。

<PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss:SSS} [%p] [%X{REQUEST_ID}] [%C.%M.%L] [%t] : %m %n"/>

时间
%d{yyyy-MM-dd HH:mm:ss:SSS}
日志级别
[%p]
MDC变量
[%X{REQUEST_ID}] 
类的全限定名
[%C.%M.%L]
线程
[%t]
消息
%m

2021-04-30 14:37:37:273 [INFO] [99de1369-8a69-4e13-80f4-1e8fe3e1d330] [io.github.liningwonder.assembly.one.Main.main.15] [main] : start programme 







自动配置
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="INFO" monitorInterval="30">
    <Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss:SSS} [%p] [%X{REQUEST_ID}] [%C.%M.%L] [%t] : %m %n"/>
        </Console>
    </Appenders>
    <Loggers>
        <Root level="error">
            <AppenderRef ref="Console"/>
        </Root>
        <logger name="io.github.liningwonder" level="info">
            <AppenderRef ref="Console"/>
        </logger>
    </Loggers>
</Configuration>

###使用SLF4J

![avatar](http://www.slf4j.org/images/concrete-bindings.png)

适配器
log4j-to-slf4j-2.x.jar

log4j-jul

log4j-to-slf4j

桥接器

log4j-slf4j-impl-2.x.jar

log4j-slf4j-impl

log4j-1.2-api

log4j-jcl


MDC

public class MDC {
  //Put a context value as identified by key
  //into the current thread's context map.
  public static void put(String key, String val);

  //Get the context identified by the key parameter.
  public static String get(String key);

  //Remove the context identified by the key parameter.
  public static void remove(String key);

  //Clear all entries in the MDC.
  public static void clear();
}