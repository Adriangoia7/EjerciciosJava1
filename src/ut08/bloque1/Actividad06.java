/*a. No, no hace falta usar this porque no hay confusión entre variables, Java ya sabe a qué se refiere.

b. Sí, porque así se aprovecha el toString de la clase padre (Persona) y no hay que repetir código.

c. Sí, daría error, porque al no tener constructor, Java no sabría cómo crear el Estudiante llamando al constructor de Persona.

d. Porque nombre es private en Persona y desde Empleado no se puede usar. Para que no dé error, nombre tendría que ser protected.

e. Que esos métodos no se pueden cambiar en las clases hijas, se quedan tal y como están.

f. No, no daría error, porque aunque no lo escribas tú, Java usa el toString de Object. */