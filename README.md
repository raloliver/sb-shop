# SB-SHOP

Simple marketplace for order meals.

### LOMBOK

Allows you to write less code, such as getters, setters, equals hash code... that kind of code looks like a boilerplate. Besides, when you add such annotation it is not necessary to write the code, the code will be generated when the code going to compile.

### THYMELEAF

You must use the way of add tags and point refs, mainly because of the context. All tags will be manage by thymeleaf, must be init with th:

### ENTITY LIFECYCLE

Has a couple of statuses, such as **new**, **managed**, and **detached**.

**Managed**: when any update occurs on this status, reflecting in the database.

### TRANSACTIONAL CONTEXT

When the app updates an entity from new to manage, by the .save() method, on the next update, such as a `customer.setName("new one")`, the data will be updated automatically on the database.

The same occurs when you use a query method, such as `findById(123)`, this entity will be managed by context and if you do anything, such as `.delete(customer)`, the changes will be reflected on the database.

#### CONTROLLER

Receive the request from the view. T**Those method uses the status detached.** When you change something here, the object will be changed in memory, but not in the database.

#### SERVICES

Resolve the business roles and here the entities are managed. **When the service returns something to the controller, the entity leaves the managed status and turns back to the detached status.**