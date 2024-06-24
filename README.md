# Search-Engine
Overview
This project implements a simple search engine with two main components: a web crawler and a search engine. The web crawler is responsible for traversing the web, extracting text and links from web pages, and storing this information in a database. The search engine component uses this indexed data to allow users to search for keywords and retrieve relevant results.

Components
Web Crawler
Database Connection and Indexer
Search Engine
History Tracking
1. Web Crawler
The web crawler is designed to traverse the web starting from a specified URL, extracting data from web pages, and following links to other pages up to a set depth limit. It uses the Jsoup library to connect to web pages and parse their HTML content. The crawler extracts the page title, text content, and hyperlinks, and stores this information in a database through the Indexer.

2. Database Connection and Indexer
The database connection component uses JDBC to manage connections to a MySQL database. The DatabaseConnection class handles the connection setup, while the Indexer class is responsible for saving the extracted data from the crawler into the database. This setup allows efficient storage and retrieval of web page data, including titles, URLs, and textual content.

3. Search Engine
The search engine component provides a web interface for users to search the indexed data. It includes a form where users can enter keywords. When a search is submitted, the Search servlet processes the request, queries the database for relevant pages based on keyword occurrences, and displays the results. The search results include the page title and link, ranked by the frequency of the keyword in the page content.

4. History Tracking
The history tracking component records each search query made by users. The History servlet retrieves and displays the search history, showing previously searched keywords and their corresponding search links. This allows users to revisit past search queries and results.

Summary
This simple search engine project demonstrates the basic functionality of a web crawler and search engine, including web traversal, data extraction, database storage, keyword search, and history tracking. It provides a foundation that can be extended with additional features such as more advanced ranking algorithms, support for different data formats, and enhanced user interfaces.
