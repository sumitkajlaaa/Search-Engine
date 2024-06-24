# Simple Search Engine

## Overview
This project implements a simple search engine, consisting of two main components: a web crawler and a search engine interface. The web crawler is responsible for traversing the web, extracting textual data and links from web pages, and storing this information in a database. The search engine component allows users to search for keywords and retrieve relevant results from the indexed data.

## Components

### 1. Web Crawler
The web crawler is designed to traverse the web starting from a specified URL. It uses the `Jsoup` library to connect to web pages and parse their HTML content. The crawler performs the following tasks:

- **URL Traversal:** Recursively follows all links found on each page up to a specified depth (`max_depth`), ensuring each URL is processed only once using a `HashSet`.
- **Document Parsing:** Extracts the page title, text content, and all hyperlinks from each visited URL.
- **Data Indexing:** Passes the extracted data to the `Indexer` class, which stores the information in a database.

This component ensures that the web crawler can efficiently collect and store data from multiple web pages, making it available for the search engine to query.

### 2. Database Connection and Indexer
The database connection and indexing components handle the storage of extracted data into a MySQL database. The `DatabaseConnection` class manages the connection setup using JDBC to connect to the database. It provides methods to establish and retrieve connections, ensuring efficient and reusable database interaction.

The `Indexer` class is responsible for saving the crawled data into the database. It extracts relevant information such as the page title, URL, and text content from the web pages and inserts this data into the database. This setup allows for efficient storage and retrieval of web page data, enabling the search engine to perform keyword searches.

### 3. Search Engine Interface
The search engine interface provides a web-based platform for users to enter search queries and retrieve results. The main features include:

- **Search Form:** A simple HTML form where users can enter keywords and submit search requests.
- **Search Processing:** The `Search` servlet processes search requests by querying the database for relevant pages. It calculates the frequency of the keyword in the page content and ranks the results accordingly.
- **Results Display:** Displays the results in a user-friendly format, showing the page title and link, allowing users to access the relevant web pages.

This component ensures that users can efficiently search and retrieve relevant data from the indexed web pages.

### 4. History Tracking
The history tracking component records each search query made by users. It includes:

- **Recording Searches:** The `Search` servlet logs each search query and the corresponding search link into the database.
- **History Retrieval:** The `History` servlet retrieves and displays the search history, showing previously searched keywords and their corresponding links.
- **User Interface:** Presents the search history in a tabular format, allowing users to revisit past search queries and results.

This component provides users with the ability to track their search history and revisit previous search results, enhancing the overall user experience.

## Summary
This simple search engine project showcases a foundational implementation of a web crawler and search engine. It includes essential functionalities such as web crawling, data indexing, keyword searching, and history tracking. Designed to be extendable, this project provides a robust base for further development and enhancement, such as incorporating more advanced ranking algorithms, supporting different data formats, and improving the user interface for a more comprehensive search experience.
