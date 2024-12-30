- **How does Elasticsearch handle scaling?**
    
    - Elasticsearch scales horizontally by adding more nodes to the cluster. Indexes are split into shards, which can be spread across multiple nodes. As the cluster grows, new nodes can take over some of the workload, and shards can be rebalanced across nodes to optimize performance.
- **Explain the concept of Routing in Elasticsearch.**
    
    - Routing is the process by which documents are assigned to specific shards. By default, Elasticsearch uses a hash of the document’s ID to determine which shard it should go to, but you can customize routing to group related documents together in the same shard (useful for queries that always need related documents).
- **What is Reindexing in Elasticsearch and why is it needed?**
    
    - Reindexing is the process of copying data from one index to another. It may be necessary if you need to change the structure of your documents, update mappings, or apply new analyzers. Elasticsearch provides a reindex API for this purpose.
- **What is Index Lifecycle Management (ILM)?**
    
    - ILM allows you to define lifecycle policies for managing the lifecycle of an index. It can move an index through different phases (hot, warm, cold, delete) based on rules like index age or size. For example, you may want to move old logs to cheaper storage or delete them entirely after a certain time.
- **How does Elasticsearch achieve near real-time (NRT) search?**
    
    - Elasticsearch achieves near real-time search by using a **refresh interval**. By default, it refreshes its in-memory data structures every second, making newly indexed documents searchable. However, this is a tradeoff between performance and freshness of search results.
- **What is the difference between `_source`, `_index`, and `_id` in Elasticsearch?**
    
    - **`_source`**: The original JSON document that you store and retrieve.
    - **`_index`**: The index to which the document belongs.
    - **`_id`**: A unique identifier for the document in the index.
- **How does Elasticsearch handle conflict resolution in case of multiple updates?**
    
    - Elasticsearch uses versioning to handle concurrent updates. Every document has a version number, and when multiple updates occur, Elasticsearch checks the version number to ensure that only the latest change is applied.
- **What are the differences between `refresh` and `flush` in Elasticsearch?**
    
    - **Refresh**: Makes newly indexed documents visible for search by updating the in-memory data structures. It happens automatically at the refresh interval (default is 1 second).
    - **Flush**: Writes in-memory data to disk and frees up the memory. It happens periodically and helps in making the index durable. A flush also involves creating a new segment on disk.
- **How does Elasticsearch ensure data durability?**
    
    - Elasticsearch ensures durability by writing data to a translog (transaction log) before acknowledging the write operation. The translog is periodically flushed to disk, and in case of a failure, it can be replayed to restore the data that was in-flight.
- **What are parent-child relationships in Elasticsearch?**
    
    - Parent-child relationships allow you to create a relationship between two documents in different indexes (or types in legacy versions). The parent document can be linked to multiple child documents, and queries can be run across both parents and children using `has_parent` or `has_child` queries.