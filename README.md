Donation Management System
--------------------------

A web application for managing donation records and family information.

**Features:**

-   **User Management and Authentication**: Currently uses hardcoded users for initial development.
-   **Family/Individual Management**:
    -   Add, update, and view details of families/individuals receiving aid.
    -   Record received aid (amount, date).
    -   Track creation/update date and responsible user for each record.
    -   Upload photos associated with families.
-   **Future Enhancements**:
    -   Implement user authentication and authorization for improved security.
    -   Explore additional features like data visualization, reporting, and role-based access control.

**Technology Stack:**

-   **Backend**: Spring Boot with AWS Lambda
-   **Frontend**:
-   **Database**: DynamoDB (NoSQL)
-   **Storage**: Amazon S3 (for file uploads)
-   **Testing**: JUnit

**Deployment:**

-   Spring Boot application deployed as a Lambda function.
-   User interface hosted as a static website (e.g., AWS S3, GitHub Pages).

**Getting Started:**

1.  **Prerequisites:**

    -   Java Development Kit (JDK)
    -   AWS Account with access to DynamoDB, Lambda, and S3
2.  **Clone the repository:**

    ```
    git clone https://github.com/JasminMA/donation-management-system.git

    ```

3.  **Set up AWS credentials:**

    -   Configure your AWS credentials locally or use environment variables.