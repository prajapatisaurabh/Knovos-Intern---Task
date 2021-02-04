# JavaTasks

<h1> 1) Core-site.xml </h1>

<p>
  <configuration>
	<property>
		<name>fs.default.name</name>
		<value>hdfs://localhost:9000</value>
	</property>
</configuration>
</p>

<h1> 2) mapred-site.xml </h1>

<configuration>
	<property>
		<name>mapreduce.jobhistory.address</name>
		<value>localhost:10020</value>
	</property>
	<property>
		<name>mapreduce.framework.name</name>
		<value>yarn</value>
	</property>
</configuration>

<h1> 3) yarn-site.xml </h1>


<configuration>
<!-- Site specific YARN configuration properties -->
	<property>
		<name>yarn.nodemanager.aux-services</name>
		<value>mapreduce_shuffle</value>
	</property>
	
	 <property>
    <description>The address for the web proxy as HOST:PORT, if this is not
     given then the proxy will run as part of the RM</description>
     <name>yarn.web-proxy.address</name>
     <value>localhost:10155</value>
  </property>
	
	
	<property>
		<name>yarn.nodemanager.auxservices.mapreduce.shuffle.class</name>
		<value>org.apache.hadoop.mapred.ShuffleHandler</value>
	</property>
</configuration>

<h1> 4) hdfs-site.xml </h1>

<configuration>
	<property>
		<name>dfs.replication</name>
		<value>1</value>
	</property>
		
	<property>
		<name>dfs.namenode.name.dir</name>
		<value>file:///C:/hadoop-3.3.0/data/namenode</value>
	</property>
	
	<property>
		<name>dfs.datanode.data.dir</name>
		<value>/C:/hadoop-3.3.0/data/datanode</value>
	</property>
	
	<property>
		<description>If "true", enable permission checking in HDFS. If "false",
		permission checking is turned off, but all other behavior is unchanged. 
		Switching from one parameter value to the other does not change the mode, 
		owner or group of files or directories. 
		</description>
		<name>dfs.permissions.enabled</name>
		<value>false</value>
  </property>
  
  <property>
		<name>dfs.permissions</name>
		<value>false</value>
  </property>
</configuration>
