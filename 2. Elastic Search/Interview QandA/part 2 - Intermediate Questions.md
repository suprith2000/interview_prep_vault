
- **What is the role of an Analyzer in Elasticsearch?**
    
    - An analyzer processes text data during indexing and querying. It typically consists of three components:
        1. **Tokenizer**: Breaks down text into individual terms.
        2. **Character Filters**: Modify characters or remove unwanted characters (e.g., HTML tags).
        3. **Token Filters**: Modify tokens, for example by applying lowercasing, removing stop words, or stemming.
    - Analyzers are used to make the text searchable by normalizing it.
- **What is the difference between `term` and `match` queries?**
    
    - The `term` query is used for exact matching and is not analyzed. It’s ideal for structured fields like IDs, tags, or keyword fields. The `match` query, on the other hand, is analyzed and breaks the input text into terms. It is used for full-text search, where the search term is analyzed similarly to how the field was indexed.
- **What is the difference between `filter` and `query` context?**
    
    - **Query Context**: Used when relevance scoring is important. Search terms are scored based on how well they match the query.
    - **Filter Context**: Used when scoring is irrelevant. Filters are more efficient and typically used for boolean conditions (`AND`, `OR`, `NOT`). Filters are often cached.
- **What is a Bool Query?**
    
    - A `bool` query combines multiple queries using boolean logic (`must`, `should`, `must_not`, and `filter` clauses).
    - `must`: The query must match (like an AND operation).
    - `should`: The query is optional but influences scoring (like an OR operation).
    - `must_not`: Excludes documents that match the query (like NOT).
    - `filter`: Documents must match the filter, but scoring isn’t considered.
- **What are Aggregations in Elasticsearch?**
    
    - Aggregations allow you to analyze and compute statistics on your data. There are different types of aggregations such as `terms` (to group data), `range` (to group data within ranges), `histogram` (to group data into buckets), and `metric` (to calculate metrics like sum, avg, min, max, etc.).
- **What is the purpose of Inverted Index in Elasticsearch?**
    
    - An inverted index is a data structure used by Elasticsearch to make full-text searches fast. It maps terms (words) to the documents that contain them. This is the core mechanism that allows Elasticsearch to efficiently retrieve relevant documents for search queries.
- **What are Token Filters and how do they work?**
    
    - Token filters are part of the text analysis process. After tokenization, token filters can modify tokens by performing actions such as lowercasing, stemming (reducing words to their base form), removing stop words (common words like "the", "and"), or synonym matching.