JpaRepository Question Answer:                
Question: Why is ProductRepository empty but methods work?           
Answer: The repository looks empty, but it still works.
Spring automatically creates all the needed methods, so we only write the interface and no extra code is required.

Work of my project:

1.POST – Create Product
This request creates a new product.
The client sends data, the product is saved in the database, and the server returns 201 Created.
<img width="1106" height="893" alt="Снимок экрана 2026-01-15 152629" src="https://github.com/user-attachments/assets/9178e8c8-2a68-497c-865b-daa85dc4ea50" />
<img width="1101" height="886" alt="Снимок экрана 2026-01-15 152639" src="https://github.com/user-attachments/assets/1b4dc887-c2b0-4184-80e7-a75ef8bd5919" />
<img width="1102" height="883" alt="Снимок экрана 2026-01-15 152650" src="https://github.com/user-attachments/assets/c3778777-b733-4de3-a45c-54f7986166ea" />

2. GET by ID – Get One Product
This request gets one product by its ID.
If the product exists, the server returns it with 200 OK. If not, it returns 404 Not Found.
<img width="1099" height="867" alt="Снимок экрана 2026-01-15 152727" src="https://github.com/user-attachments/assets/c8232ccf-bc11-4e38-979f-219e2fc47b67" />

3.GET ALL – Get All Products
This request gets all products from the database.
The server returns a list with 200 OK.
<img width="1095" height="968" alt="Снимок экрана 2026-01-15 152746" src="https://github.com/user-attachments/assets/6974457e-6d89-4797-b5f1-db2589802dfe" />

4. PUT – Update Product
This request updates an existing product.
If the product exists, it is updated and 200 OK is returned.
<img width="1119" height="680" alt="Снимок экрана 2026-01-15 153018" src="https://github.com/user-attachments/assets/365db0ef-1008-4cb1-af3a-1ef317b84714" />

5. DELETE – Delete Product
This request deletes a product by ID.
If the product exists, it is removed and 204 No Content is returned.
<img width="1108" height="757" alt="Снимок экрана 2026-01-15 153027" src="https://github.com/user-attachments/assets/6da34a85-5da9-4be0-921d-67cf32c3ea46" />

6. Exception Handling – 404 Error
If a client requests a product that does not exist, the server returns 404 Not Found with an error message.
<img width="1111" height="711" alt="Снимок экрана 2026-01-15 152759" src="https://github.com/user-attachments/assets/492a498d-4441-4157-bc1d-2f97129c11a7" />

7. H2 Database Console http://localhost:8080/console
H2 is a test database.
The table is created automatically, and we can see the data in real time.

Connection details:
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: (empty)

<img width="1203" height="817" alt="Снимок экрана 2026-01-15 155546" src="https://github.com/user-attachments/assets/8b77a9be-c068-44f4-ab17-08b299493ff4" />





