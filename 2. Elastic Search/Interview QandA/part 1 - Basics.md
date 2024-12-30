### **Basic Questions**

1. **What is Elasticsearch?**
    
    - Elasticsearch is an open-source, distributed search and analytics engine built on Apache Lucene. It provides real-time search capabilities and is often used for logging, analytics, and full-text search use cases.
2. **What is an Index in Elasticsearch?**
    
    - An index in Elasticsearch is a collection of documents that share similar characteristics. It's equivalent to a database in the world of relational databases. Each index is identified by a name and is used to perform search and query operations.
3. **What is a Document in Elasticsearch?**
    
    - A document is a basic unit of information stored in Elasticsearch and is expressed in JSON format. It contains fields (key-value pairs) and belongs to an index. Think of it as a row in a database table.
4. **What is a Shard in Elasticsearch?**
    
    - A shard is a smaller, manageable piece of an Elasticsearch index. When you create an index, you can define how many primary shards it should have. Shards allow an index to be distributed across multiple nodes in the cluster for parallel processing and increased scalability.
5. **What is a Replica in Elasticsearch?**
    
    - A replica is a copy of a shard. Replicas provide fault tolerance and high availability, as well as improve query throughput by allowing search requests to be handled by replica shards when the primary shard is busy.
6. **Explain the Elasticsearch REST API.**
    
    - Elasticsearch provides a RESTful API to interact with the cluster. You can perform operations such as creating, reading, updating, and deleting documents, and running search queries and aggregations via simple HTTP methods (`GET`, `POST`, `PUT`, `DELETE`).
7. **What is a Cluster in Elasticsearch?**
    
    - A cluster is a collection of one or more nodes (servers) that work together to store and search data. A cluster is identified by a unique name and can distribute data across multiple nodes for scalability.
8. **What is a Node in Elasticsearch?**
    
    - A node is a single server within an Elasticsearch cluster that stores data and participates in the indexing and searching process. A cluster can have one or more nodes.
