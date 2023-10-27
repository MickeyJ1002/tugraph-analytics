/*
 * Copyright 2023 AntGroup CO., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */

package com.antgroup.geaflow.common.config.keys;

import com.antgroup.geaflow.common.config.ConfigKey;
import com.antgroup.geaflow.common.config.ConfigKeys;
import com.antgroup.geaflow.common.shuffle.StorageLevel;
import com.antgroup.geaflow.common.utils.ProcessUtil;
import java.io.Serializable;

public class ExecutionConfigKeys implements Serializable {

    // ------------------------------------------------------------------------
    // console
    // ------------------------------------------------------------------------

    public static final ConfigKey GEAFLOW_GW_ENDPOINT = ConfigKeys
        .key("geaflow.gw.endpoint")
        .noDefaultValue()
        .description("console address, such as http://localhost:8888");

    public static final ConfigKey JOB_APP_NAME = ConfigKeys
        .key("geaflow.job.runtime.name")
        .defaultValue("default")
        .description("job app name generated by console");

    public static final ConfigKey JOB_UNIQUE_ID = ConfigKeys
        .key("geaflow.job.unique.id")
        .noDefaultValue()
        .description("job unique id generated by console");

    public static final ConfigKey CLUSTER_ID = ConfigKeys
        .key("geaflow.job.cluster.id")
        .defaultValue("")
        .description("geaflow job cluster id");

    public static final ConfigKey SYSTEM_META_TABLE = ConfigKeys
        .key("geaflow.system.meta.table")
        .noDefaultValue()
        .description("system meta table");

    public static final ConfigKey CLUSTER_STARTED_CALLBACK_URL = ConfigKeys
        .key("geaflow.cluster.started.callback.url")
        .defaultValue("")
        .description("callback url to register the cluster info");

    // ------------------------------------------------------------------------
    // rpc
    // ------------------------------------------------------------------------

    public static final ConfigKey MASTER_RPC_HOST = ConfigKeys.key("geaflow.master.rpc.host")
        .noDefaultValue()
        .description("master rpc host address");

    public static final ConfigKey MASTER_RPC_PORT = ConfigKeys.key("geaflow.master.rpc.port")
        .defaultValue(6123)
        .description("master rpc port");

    public static final ConfigKey MASTER_HTTP_PORT = ConfigKeys.key("geaflow.master.http.port")
        .defaultValue(8090)
        .description("master http port");

    public static final ConfigKey DRIVER_RPC_PORT = ConfigKeys.key("geaflow.driver.rpc.port")
        .defaultValue(6123)
        .description("driver rpc port");

    public static final ConfigKey RPC_ASYNC_THREADS = ConfigKeys
        .key("geaflow.rpc.async.thread.num")
        .defaultValue(2)
        .description("rpc thread pool number");

    public static final ConfigKey HEARTBEAT_INTERVAL_MS = ConfigKeys
        .key("geaflow.heartbeat.interval.ms")
        .defaultValue(30000)
        .description("heartbeat interval");

    public static final ConfigKey HEARTBEAT_INITIAL_DELAY_MS = ConfigKeys
        .key("geaflow.heartbeat.initial.delay.ms")
        .defaultValue(10000)
        .description("heart beat thread initial delay");

    public static final ConfigKey HEARTBEAT_TIMEOUT_MS = ConfigKeys
        .key("geaflow.heartbeat.timeout.ms")
        .defaultValue(120000)
        .description("heartbeat timeout in ms");

    public static final ConfigKey HEARTBEAT_REPORT_INTERVAL_MS = ConfigKeys
        .key("geaflow.heartbeat.report.interval.ms")
        .defaultValue(30000)
        .description("heartbeat report interval in ms");

    public static final ConfigKey HEARTBEAT_REPORT_EXPIRED_MS = ConfigKeys
        .key("geaflow.heartbeat.report.expired.ms")
        .noDefaultValue()
        .description("heartbeat report expired time in ms");

    public static final ConfigKey RPC_RETRY_TIMES = ConfigKeys
        .key("geaflow.rpc.retry.times")
        .defaultValue(20)
        .description("max retry of rpc connection");

    public static final ConfigKey RPC_RETRY_INTERVAL_MS = ConfigKeys
        .key("geaflow.rpc.retry.interval.ms")
        .defaultValue(1000)
        .description("retry interval of rpc connection in ms");

    public static final ConfigKey RPC_CONNECT_TIMEOUT_MS = ConfigKeys
        .key("geaflow.rpc.connect.timeout.ms")
        .defaultValue(5000)
        .description("rpc connect timeout");

    // ------------------------------------------------------------------------
    // cluster
    // ------------------------------------------------------------------------

    public static final ConfigKey RUN_LOCAL_MODE = ConfigKeys
        .key("geaflow.run.local.mode")
        .defaultValue(false)
        .description("job run in single process or distributed");

    public static final ConfigKey JOB_WORK_PATH = ConfigKeys
        .key("geaflow.work.path")
        .defaultValue("/tmp")
        .description("job work path on disk");

    public static final ConfigKey CONTAINER_DISPATCH_THREADS = ConfigKeys
        .key("geaflow.container.dispatcher.threads")
        .defaultValue(1)
        .description("container event dispatcher thread number");

    public static final ConfigKey CLIENT_VCORES = ConfigKeys.key("geaflow.client.vcores")
        .defaultValue(1.0)
        .description("client cpu number");

    public static final ConfigKey CLIENT_MEMORY_MB = ConfigKeys.key("geaflow.client.memory.mb")
        .defaultValue(1024)
        .description("client container memory");

    public static final ConfigKey CLIENT_DISK_GB = ConfigKeys.key("geaflow.client.disk.gb")
        .defaultValue(0)
        .description("client container disk");

    public static final ConfigKey CLIENT_JVM_OPTIONS = ConfigKeys.key("geaflow.client.jvm.options")
        .defaultValue("-Xmx1024m,-Xms1024m,-Xmn256m,-Xss256k,-XX:MaxDirectMemorySize=512m")
        .description("client jvm options");

    public static final ConfigKey MASTER_MEMORY_MB = ConfigKeys.key("geaflow.master.memory.mb")
        .defaultValue(4096)
        .description("master container memory");

    public static final ConfigKey MASTER_DISK_GB = ConfigKeys.key("geaflow.master.disk.gb")
        .defaultValue(0)
        .description("master container disk");

    public static final ConfigKey MASTER_JVM_OPTIONS = ConfigKeys.key("geaflow.master.jvm.options")
        .defaultValue("-Xmx2048m,-Xms2048m,-Xmn512m,-Xss512k,-XX:MaxDirectMemorySize=1024m")
        .description("master container jvm options");

    public static final ConfigKey MASTER_VCORES = ConfigKeys.key("geaflow.master.vcores")
        .defaultValue(1.0)
        .description("master cpu");

    public static final ConfigKey DRIVER_NUM = ConfigKeys.key("geaflow.driver.num")
        .defaultValue(1)
        .description("driver number");

    public static final ConfigKey DRIVER_MEMORY_MB = ConfigKeys.key("geaflow.driver.memory.mb")
        .defaultValue(4096)
        .description("driver container memory");

    public static final ConfigKey DRIVER_DISK_GB = ConfigKeys.key("geaflow.driver.disk.gb")
        .defaultValue(0)
        .description("driver container disk");

    public static final ConfigKey DRIVER_JVM_OPTION = ConfigKeys.key("geaflow.driver.jvm.options")
        .defaultValue("-Xmx2048m,-Xms2048m,-Xmn512m,-Xss512k,-XX:MaxDirectMemorySize=1024m")
        .description("driver container jvm options");

    public static final ConfigKey DRIVER_VCORES = ConfigKeys.key("geaflow.driver.vcores")
        .defaultValue(1.0)
        .description("driver cpu");

    public static final ConfigKey CONTAINER_NUM = ConfigKeys.key("geaflow.container.num")
        .defaultValue(1)
        .description("container num");

    public static final ConfigKey CONTAINER_VCORES = ConfigKeys.key("geaflow.container.vcores")
        .defaultValue(1.0)
        .description("container cpu");

    public static final ConfigKey CONTAINER_MEMORY_MB = ConfigKeys
        .key("geaflow.container.memory.mb")
        .defaultValue(256)
        .description("container memory");

    public static final ConfigKey CONTAINER_DISK_GB = ConfigKeys
        .key("geaflow.container.disk.gb")
        .defaultValue(0)
        .description("container disk");

    public static final ConfigKey CONTAINER_WORKER_NUM = ConfigKeys
        .key("geaflow.container.worker.num")
        .defaultValue(16)
        .description("max worker num in container");

    public static final ConfigKey CONTAINER_JVM_OPTION = ConfigKeys
        .key("geaflow.container.jvm.options")
        .noDefaultValue()
        .description("container jvm options");

    public static final ConfigKey CONTAINER_HEAP_SIZE_MB = ConfigKeys
        .key("geaflow.container.heap.size.mb")
        .noDefaultValue()
        .description("container max heap size in mb");

    public static final ConfigKey REGISTER_TIMEOUT = ConfigKeys
        .key("geaflow.register.timeout.seconds")
        .defaultValue(120)
        .description("driver/container register timeout");

    public static final ConfigKey FO_ENABLE = ConfigKeys
        .key("geaflow.fo.enable")
        .defaultValue(true)
        .description("whether to enable fo");

    public static final ConfigKey FO_STRATEGY = ConfigKeys
        .key("geaflow.fo.strategy")
        .defaultValue("cluster_fo")
        .description("whether to enable fo");

    public static final ConfigKey FO_TIMEOUT_MS = ConfigKeys.key("geaflow.fo.timeout.ms")
        .defaultValue(600000)
        .description("fo timeout in ms");

    public static final ConfigKey FO_MAX_RESTARTS = ConfigKeys
        .key("geaflow.fo.max.restarts")
        .defaultValue(Integer.MAX_VALUE)
        .description("process max restart times, value in [0, Int.maxValue]");

    public static final ConfigKey HA_SERVICE_TYPE = ConfigKeys
        .key("geaflow.ha.service.type")
        .defaultValue("")
        .description("ha service type, e.g., [redis, hbase, memory]");

    // ------------------------------------------------------------------------
    // shuffle
    // ------------------------------------------------------------------------

    /** shuffle common config. */

    public static final ConfigKey SHUFFLE_IO_MAX_RETRIES = ConfigKeys
        .key("geaflow.shuffle.io.max.retries")
        .defaultValue(5)
        .description("shuffle io max retry times");

    public static final ConfigKey SHUFFLE_IO_RETRY_WAIT = ConfigKeys
        .key("geaflow.shuffle.io.retry.wait.ms")
        .defaultValue(500)
        .description("time to wait in each shuffle io retry");

    public static final ConfigKey SHUFFLE_SERDE_THREADS = ConfigKeys
        .key("geaflow.shuffle.serde.thread.num")
        .defaultValue(8)
        .description("shuffle serde thread num");

    public static final ConfigKey SHUFFLE_INFLIGHT_MEMORY_FRACTION = ConfigKeys
        .key("geaflow.shuffle.inflight.memory.fraction")
        .defaultValue(0.3)
        .description("fraction of shuffle memory in flight");

    public static final ConfigKey SHUFFLE_MAX_BYTES_IN_FLIGHT = ConfigKeys
        .key("geaflow.shuffle.max.bytes.inflight")
        .defaultValue(128 * 1024 * 1024L)
        .description("max number of bytes in flight");

    public static final ConfigKey SHUFFLE_MEMORY_POOL_ENABLE = ConfigKeys
        .key("geaflow.shuffle.memory.pool.enable")
        .defaultValue(true)
        .description("whether to enable shuffle memory pool");

    public static final ConfigKey SHUFFLE_COMPRESSION_ENABLE = ConfigKeys
        .key("geaflow.shuffle.compression.enable")
        .defaultValue(true)
        .description("whether to enable shuffle compression");

    public static final ConfigKey SHUFFLE_COMPRESSION_CODEC = ConfigKeys
        .key("geaflow.shuffle.compression.codec")
        .defaultValue("snappy")
        .description("codec of shuffle compression");

    /** shffle network config. */

    public static final ConfigKey NETTY_SERVER_HOST = ConfigKeys
        .key("geaflow.netty.server.host")
        .defaultValue(ProcessUtil.LOCAL_ADDRESS)
        .description("netty server host");

    public static final ConfigKey NETTY_SERVER_PORT = ConfigKeys
        .key("geaflow.netty.server.port")
        .defaultValue(0)
        .description("netty server port");

    public static final ConfigKey NETTY_SERVER_BACKLOG = ConfigKeys
        .key("geaflow.netty.server.backlog")
        .defaultValue(512)
        .description("requested maximum length of the queue of incoming connections");

    public static final ConfigKey NETTY_SERVER_THREADS_NUM = ConfigKeys
        .key("geaflow.netty.server.threads")
        .defaultValue(4)
        .description("number of threads used in the server thread pool. default to 4, and 0 means 2x#cores");

    public static final ConfigKey NETTY_CLIENT_THREADS_NUM = ConfigKeys
        .key("geaflow.netty.client.threads")
        .defaultValue(4)
        .description("number of threads used in the client thread pool. default to 4, and 0 means 2x#cores");

    public static final ConfigKey NETTY_CONNECT_TIMEOUT_MS = ConfigKeys
        .key("geaflow.netty.connect.timeout.ms")
        .defaultValue(180000)
        .description("netty connection timeout in milliseconds");

    public static final ConfigKey NETTY_CONNECT_MAX_RETRIES = ConfigKeys
        .key("geaflow.netty.connect.retries")
        .defaultValue(100)
        .description("max retry times of netty connection");

    public static final ConfigKey NETTY_CONNECT_INITIAL_BACKOFF_MS = ConfigKeys
        .key("geaflow.netty.connect.initial.backoff.ms")
        .defaultValue(10)
        .description("initial backoff time of netty connection in milliseconds");

    public static final ConfigKey NETTY_CONNECT_MAX_BACKOFF_MS = ConfigKeys
        .key("geaflow.netty.connect.max.backoff.ms")
        .defaultValue(300000)
        .description("max backoff time of netty connection in milliseconds");

    public static final ConfigKey NETTY_RECEIVE_BUFFER_SIZE = ConfigKeys
        .key("geaflow.netty.receive.buffer.size")
        .defaultValue(0)
        .description("netty receive buffer size");

    public static final ConfigKey NETTY_SEND_BUFFER_SIZE = ConfigKeys
        .key("geaflow.netty.send.buffer.size")
        .defaultValue(0)
        .description("netty send buffer size");

    public static final ConfigKey NETTY_NUM_CONNECTIONS_PER_PEER = ConfigKeys
        .key("geaflow.netty.connections.per.peer")
        .defaultValue(1)
        .description("num of netty connections per peer");

    public static final ConfigKey NETTY_THREAD_CACHE_ENABLE = ConfigKeys
        .key("geaflow.netty.thread.cache.enable")
        .defaultValue(true)
        .description("whether to enable netty thread cache");

    public static final ConfigKey NETTY_PREFER_DIRECT_BUFFER = ConfigKeys
        .key("geaflow.netty.prefer.direct.buffer")
        .defaultValue(true)
        .description("whether to prefer direct buffer");

    public static final ConfigKey NETTY_CUSTOM_FRAME_DECODER_ENABLE = ConfigKeys
        .key("geaflow.netty.custom.frame.decoder.enable")
        .defaultValue(true)
        .description("whether to enable custom frame decoder");

    /** shuffle fetch config. */

    public static final ConfigKey SHUFFLE_MAX_REQUESTS_IN_FLIGHT = ConfigKeys
        .key("geaflow.shuffle.max.requests.inflight")
        .defaultValue(2)
        .description("max num of requests in flight");

    public static final ConfigKey SHUFFLE_FETCH_TIMEOUT_MS = ConfigKeys
        .key("geaflow.shuffle.fetch.timeout.ms")
        .defaultValue(600000)
        .description("shuffle fetch timeout in milliseconds");

    public static final ConfigKey SHUFFLE_FETCH_QUEUE_SIZE = ConfigKeys
        .key("geaflow.shuffle.fetch.queue.size")
        .defaultValue(1)
        .description("size of shuffle fetch queue");

    /** shuffle write config. */

    public static final ConfigKey SHUFFLE_SPILL_RECORDS = ConfigKeys
        .key("geaflow.shuffle.spill.records")
        .defaultValue(10000)
        .description("num of shuffle spill records");

    public static final ConfigKey SHUFFLE_SLICE_MAX_SPILL_SIZE = ConfigKeys
        .key("geaflow.max.spill.size.perSlice")
        .defaultValue(1610612736L) // 1.5G
        .description("max size of each spill per slice in Bytes");

    public static final ConfigKey SHUFFLE_WRITE_BUFFER_SIZE_BYTES = ConfigKeys
        .key("geaflow.shuffle.write.buffer.size.bytes")
        .defaultValue(128 * 1024)
        .description("size of shuffle write buffer");

    public static final ConfigKey SHUFFLE_EMIT_BUFFER_SIZE = ConfigKeys
        .key("geaflow.shuffle.emit.buffer.size")
        .defaultValue(1024)
        .description("size of shuffle emit buffer of java object");

    public static final ConfigKey SHUFFLE_EMIT_QUEUE_SIZE = ConfigKeys
        .key("geaflow.shuffle.emit.queue.size")
        .defaultValue(1)
        .description("size of shuffle emit queue");

    public static final ConfigKey SHUFFLE_FLUSH_BUFFER_TIMEOUT_MS = ConfigKeys
        .key("geaflow.shuffle.flush.buffer.timeout.ms")
        .defaultValue(100)
        .description("shuffle flush buffer timeout ms");

    public static final ConfigKey SHUFFLE_CACHE_SPILL_THRESHOLD = ConfigKeys
        .key("geaflow.shuffle.cache.spill.threshold")
        .defaultValue(0.1)
        .description("threshold of shuffle cache spill");

    /** shuffle storage. */

    public static final ConfigKey SHUFFLE_STORAGE_TYPE = ConfigKeys
        .key("geaflow.shuffle.storage.type")
        .defaultValue(StorageLevel.disk)
        .description("type of shuffle storage");

    public static final ConfigKey SHUFFLE_OFFHEAP_MEMORY_FRACTION = ConfigKeys
        .key("geaflow.shuffle.offheap.fraction")
        .defaultValue(0.2)
        .description("fraction of shuffle offheap memory");

    public static final ConfigKey SHUFFLE_HEAP_MEMORY_FRACTION = ConfigKeys
        .key("geaflow.shuffle.heap.memory.fraction")
        .defaultValue(0.2)
        .description("fraction of shuffle heap memory");

    public static final ConfigKey SHUFFLE_MEMORY_SAFETY_FRACTION = ConfigKeys
        .key("geaflow.shuffle.memory.safety.fraction")
        .defaultValue(0.9)
        .description("fraction of shuffle memory to ensure safety");

    /** remote shuffle. */

    public static final ConfigKey SHUFFLE_SPILL_TO_LOCAL = ConfigKeys
        .key("geaflow.shuffle.spill.local.enable")
        .defaultValue(true)
        .description("whether to enable local spill");

    public static final ConfigKey SHUFFLE_SIZE_PER_HANDLER = ConfigKeys
        .key("geaflow.shuffle.size.per.handler")
        .defaultValue(32 * 1024 * 1024)
        .description("shuffle size per handler");

    public static final ConfigKey SHUFFLE_MAX_BLOCK_TO_MEM = ConfigKeys
        .key("geaflow.shuffle.max.block.to.mem")
        .defaultValue(32 * 1024 * 1024L)
        .description("max size of block to shuffle memory");

    public static final ConfigKey SHUFFLE_STORE_DATA_ROOT = ConfigKeys
        .key("geaflow.shuffle.store.data.root")
        .defaultValue("/remote-shuffle")
        .description("shuffle store data root");

    // ------------------------------------------------------------------------
    // metrics
    // ------------------------------------------------------------------------

    public static final ConfigKey SCHEDULE_PERIOD = ConfigKeys
        .key("geaflow.metric.schedule.period.sec")
        .defaultValue(30)
        .description("metric report interval in seconds");

    public static final ConfigKey REPORTER_LIST = ConfigKeys.key("geaflow.metric.reporters")
        .defaultValue("")
        .description("metric reporter list. Multiple reporters are seperated by comma. for "
            + "example: influxdb,tsdb,slf4j");

    public static final ConfigKey METRIC_META_REPORT_DELAY = ConfigKeys
        .key("geaflow.metric.meta.delay.sec")
        .defaultValue(5)
        .description("metric meta report thread initial delay, used in tsdb reporter");

    public static final ConfigKey METRIC_META_REPORT_PERIOD = ConfigKeys
        .key("geaflow.metric.meta.period.sec")
        .defaultValue(10)
        .description("metric meta report period in seconds, used in tsdb reporter");

    public static final ConfigKey METRIC_META_REPORT_RETRIES = ConfigKeys
        .key("geaflow.metric.meta.retries")
        .defaultValue(5)
        .description("metric meta report max retry times");

    public static final ConfigKey STATS_METRIC_STORE_TYPE = ConfigKeys
        .key("geaflow.metric.stats.type")
        .defaultValue("MEMORY")
        .description("stats metrics store type, e.g., [MEMORY, JDBC, HBASE]");

    public static final ConfigKey STATS_METRIC_FLUSH_THREADS = ConfigKeys
        .key("geaflow.metric.flush.threads")
        .defaultValue(1)
        .description("stats metrics flush thread number");

    public static final ConfigKey STATS_METRIC_FLUSH_BATCH_SIZE = ConfigKeys
        .key("geaflow.metric.flush.batch.size")
        .defaultValue(200)
        .description("stats metrics flush batch size");

    public static final ConfigKey STATS_METRIC_FLUSH_INTERVAL_MS = ConfigKeys
        .key("geaflow.metric.flush.interval.ms")
        .defaultValue(1000)
        .description("stats flush interval in ms");

    public static final ConfigKey ENABLE_DETAIL_METRIC = ConfigKeys
        .key("geaflow.metric.detail.enable")
        .defaultValue(false)
        .description("if enable detail job metric");

}
