# ikedestiny-blogBackend
# Blog Backend API

This API provides endpoints for managing blog posts, including creating, retrieving, updating, deleting, and searching blog posts.

## Table of Contents

- [Base URL](#base-url)
- [Endpoints](#endpoints)
    - [Get All Blog Posts](#get-all-blog-posts)
    - [Get Blog Post by ID](#get-blog-post-by-id)
    - [Create a New Blog Post](#create-a-new-blog-post)
    - [Delete a Blog Post by ID](#delete-a-blog-post-by-id)
    - [Search Blog Posts](#search-blog-posts)
- [Models](#models)
- [Error Handling](#error-handling)
- [Dependencies](#dependencies)

## Base URL

The base URL for this API is:



## Endpoints

### Get All Blog Posts

- **URL**: `/posts`
- **Method**: `GET`
- **Description**: Retrieves a list of all blog posts.
- **Response**:
    - **Status**: 200 OK
    - **Body**: List of `BlogPost` objects

### Get Blog Post by ID

- **URL**: `/posts/{id}`
- **Method**: `GET`
- **Description**: Retrieves a blog post by its ID.
- **Path Variable**:
    - `id` (String): The ID of the blog post.
- **Response**:
    - **Status**: 200 OK
    - **Body**: `BlogPost` object or `null` if not found

### Create a New Blog Post

- **URL**: `/create-new-blog`
- **Method**: `POST`
- **Description**: Creates a new blog post.
- **Request Body**: `BlogPost` object
- **Response**:
    - **Status**: 201 Created
    - **Body**: Created `BlogPost` object

### Delete a Blog Post by ID

- **URL**: `/delete/{id}`
- **Method**: `DELETE`
- **Description**: Deletes a blog post by its ID.
- **Path Variable**:
    - `id` (String): The ID of the blog post.
- **Response**:
    - **Status**: 200 OK
    - **Body**: Success message

### Search Blog Posts

- **URL**: `/search/{text}`
- **Method**: `GET`
- **Description**: Searches for blog posts containing the specified text.
- **Path Variable**:
    - `text` (String): The text to search for.
- **Response**:
    - **Status**: 200 OK
    - **Body**: List of `BlogPost` objects matching the search criteria

## Models

### BlogPost

- **id** (String): The unique identifier of the blog post.
- **title** (String): The title of the blog post.
- **content** (String): The content of the blog post.
- **author** (String): The author of the blog post.
- **created** (Date): The creation date of the blog post.

## Error Handling

- **400 Bad Request**: Returned when the request is malformed or missing required parameters.
- **404 Not Found**: Returned when a resource is not found.
- **500 Internal Server Error**: Returned when an unexpected error occurs on the server.

## Dependencies

- **Spring Boot**: Framework for building the API.
- **Spring Data JPA**: For database interactions.
- **Spring Web**: For building RESTful web services.

## Example

### Create a New Blog Post

**Request**:
```http
POST /create-new-blog
Content-Type: application/json

{
    "title": "A Guide to Modern Web Development",
    "created": [
      2025,
      1,
      8,
      11,
      45
    ],
    "author": "Alice Green",
    "paragraphs": [
      {
        "title": "Understanding Frontend Frameworks",
        "content": "Frontend frameworks like React, Angular, and Vue.js simplify web development by providing pre-built components and tools."
      },
      {
        "title": "Backend Technologies",
        "content": "Modern backend development often involves using Node.js, Django, or Spring Boot to create scalable and robust applications."
      },
      {
        "title": "The Role of APIs",
        "content": "APIs connect different parts of an application, enabling seamless communication between frontend and backend services."
      },
      {
        "title": "Conclusion",
        "content": "By staying updated with the latest tools and trends, developers can build efficient and user-friendly web applications."
      }
    ]
  }

HTTP/1.1 200 OK
Content-Type: application/json

[
  {
    "id": "678105bb27465dbfaf6822db",
    "title": "A Guide to Modern Web Development",
    "created": [
      2025,
      1,
      8,
      11,
      45
    ],
    "author": "Alice Green",
    "paragraphs": [
      {
        "title": "Understanding Frontend Frameworks",
        "content": "Frontend frameworks like React, Angular, and Vue.js simplify web development by providing pre-built components and tools."
      },
      {
        "title": "Backend Technologies",
        "content": "Modern backend development often involves using Node.js, Django, or Spring Boot to create scalable and robust applications."
      },
      {
        "title": "The Role of APIs",
        "content": "APIs connect different parts of an application, enabling seamless communication between frontend and backend services."
      },
      {
        "title": "Conclusion",
        "content": "By staying updated with the latest tools and trends, developers can build efficient and user-friendly web applications."
      }
    ]
  },
  {
    "id": "678105bb27465dbfaf6822da",
    "title": "The Future of Renewable Energy",
    "created": [
      2025,
      1,
      9,
      14,
      30
    ],
    "author": "Jane Smith",
    "paragraphs": [
      {
        "title": "Introduction",
        "content": "As the world moves towards sustainability, renewable energy sources like solar and wind power are becoming vital."
      },
      {
        "title": "Solar Power Advancements",
        "content": "Recent advancements in solar technology have made it more efficient and accessible, enabling widespread adoption."
      },
      {
        "title": "Wind Energy Potential",
        "content": "With increasing investments in wind farms, wind energy is poised to become a dominant source of clean power."
      },
      {
        "title": "Conclusion",
        "content": "The future of renewable energy is bright, but it requires global cooperation and innovation to meet growing energy demands sustainably."
      }
    ]
  },
  {
    "id": "678105bb27465dbfaf6822d9",
    "title": "The Rise of AI in Everyday Life",
    "created": [
      2025,
      1,
      10,
      8,
      0
    ],
    "author": "John Doe",
    "paragraphs": [
      {
        "title": "Introduction to AI",
        "content": "Artificial intelligence (AI) is transforming how we live, work, and interact with technology. From smart assistants to autonomous vehicles, its applications are everywhere."
      },
      {
        "title": "AI in Healthcare",
        "content": "AI is revolutionizing healthcare by enabling faster diagnosis, personalized treatment plans, and improved patient care through predictive analytics."
      },
      {
        "title": "Challenges of AI",
        "content": "Despite its benefits, AI faces challenges such as ethical concerns, data privacy issues, and the potential for job displacement."
      }
    ]
  }
]
