 <table><tr><th colspan="4" valign="top">Módulo</th><th colspan="3" valign="top">Nivel de Dificultad</th></tr>
<tr><td colspan="4" valign="top">Desarrollo de aplicaciones JEE conSpring Framework</td><td colspan="3" valign="top">Medio</td></tr>
<tr><td colspan="4" valign="top">Tema: El Framework Spring MVC</td><td colspan="3" valign="top">Configuración de un proyecto Spring MVC</td></tr>
<tr><td colspan="7" valign="top">Intención del aprendizaje o aprendizaje esperado:</td></tr>
<tr><td colspan="7" valign="top"><p></p><p>- Configura un proyecto Java utilizando el gestor Maven e incorporando las dependencias requeridas para obtener un proyecto Spring Framework MVC.</p><p>- Codifica vistas y controladores que permitan el despliegue de contenidos estáticos para permitir la navegación web de un usuario.</p></td></tr>
<tr><td colspan="7" valign="top">Planteamiento del Problema:</td></tr>
<tr><td colspan="7" valign="top"><p></p><p>Una empresa de asesorías en prevención de riesgos necesita contar con un sistema de información que le permita administrar los principales procesos que se llevan a cabo en ella día a día.</p><p></p><p>Hasta el momento se han definido las siguientes funcionalidades en el sistema:</p><p></p><p><b>ID	Nombre	Detalle	Actor(es)</b></p></td></tr>
<tr><td colspan="1" rowspan="2" valign="top"></td><td colspan="1" valign="top">1</td><td colspan="1" valign="top"><b>Inicio</b></td><td colspan="2" valign="top"><p>Página  de  inicio	del  portal  con</p><p>información relevante del proyecto</p></td><td colspan="1" valign="top"><p>Cliente /</p><p>Administrativo /</p></td><td colspan="1" rowspan="2" valign="top"></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="2" valign="top">que se está realizando.</td><td colspan="1" valign="top">Profesional</td></tr>
<tr><td colspan="1" rowspan="3" valign="top"></td><td colspan="1" valign="top">2</td><td colspan="1" valign="top"><b>Contacto</b></td><td colspan="2" valign="top">Formulario de contacto para realizar</td><td colspan="1" rowspan="3" valign="top"><p>Cliente</p><p></p><p>Cliente</p></td><td colspan="1" rowspan="3" valign="top"></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="2" valign="top">consultas.</td></tr>
<tr><td colspan="1" valign="top">3</td><td colspan="1" valign="top"><b>Crear Capacitación</b></td><td colspan="2" valign="top">Formulario	para	crear	una</td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"><p></p><p>4</p></td><td colspan="1" valign="top"><p></p><p><b>Listar Capacitaciones</b></p></td><td colspan="2" valign="top"><p>capacitación en el sistema.</p><p>Listado de capacitaciones registradas.</p></td><td colspan="1" valign="top"><p></p><p>Cliente</p></td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top">5</td><td colspan="1" valign="top"><b>Listado de Usuarios</b></td><td colspan="2" valign="top">Listado con los usuarios existentes en plataforma.</td><td colspan="1" valign="top">Administrativo</td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top">6</td><td colspan="1" valign="top"><b>Crear Usuario</b></td><td colspan="2" valign="top">Formulario que permitirá crear un</td><td colspan="1" valign="top">Administrativo</td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"><p></p><p>7</p></td><td colspan="1" valign="top"><p></p><p><b>Editar Cliente</b></p></td><td colspan="2" valign="top"><p>usuario en sistema.</p><p>Formulario que permite modificar los</p></td><td colspan="1" valign="top"><p></p><p>Administrativo</p></td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"><p></p><p>8</p></td><td colspan="1" valign="top"><p></p><p><b>Editar Administrativo</b></p></td><td colspan="2" valign="top">datos de un usuario de tipo cliente. Formulario que permite modificar los</td><td colspan="1" valign="top"><p></p><p>Administrativo</p></td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="2" valign="top">datos	de	un	usuario	de	tipo administrativo.</td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top">9</td><td colspan="1" valign="top"><b>Editar Profesional</b></td><td colspan="2" valign="top"><p>Formulario que permite modificar los</p><p>datos	de	un	usuario	de	tipo profesional.</p></td><td colspan="1" valign="top">Administrativo</td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="2" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="2" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td></tr>
</table>

| 10 | **Listado Visitas**        | <p>Lista de todas las visitas realizadas a cada uno de los clientes. Además,</p><p>posee un formulario que permite agregar nuevas visitas a sistema.</p>                                             | Profesional                                         |
|:---|:---------------------------|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:----------------------------------------------------|
| 11 | **Responder checklist**    | Listado de chequeos de una visita.                                                                                                                                                                   | Profesional                                         |
| 12 | **Listado Pago**           | Lista de todos los pagos realizados por los clientes.                                                                                                                                                | Administrativo                                      |
| 13 | **Crear Pago**             | Permitirá agregar un pago al sistema.                                                                                                                                                                | Administrativo                                      |
| 14 | **Listado Asesorías**      | Lista con las asesorías realizadas hasta el momento.                                                                                                                                                 | Profesional                                         |
| 15 | **Crear Asesorías**        | Contiene un formulario para agregar una nueva asesoría.                                                                                                                                              | Profesional                                         |
| 16 | **Reportes**               | Despliega reportes específicos.                                                                                                                                                                      | Profesional                                         |
| 17 | **Administrar Asistentes** | <p>Administración de asistentes a una</p><p>capacitación; incluye listarlos, poder agregar asistentes y eliminarlos.</p>                                                                             | Cliente                                             |
| 18 | **Login**                  | <p>Contendrá un acceso a un usuario al portal a través de un RUT de usuario y</p><p>una clave.</p>                                                                                                   | <p>Cliente	/</p><p>Administrativo	/ Profesional</p> |
| 19 | **Gestionar accidentes**   | <p>Listado con todos los accidentes registrados en plataforma. Además, permite editarlos, agregar uno nuevo y eliminarlos. En esta sección cada</p><p>cliente administra sus propios accidentes.</p> | Cliente                                             |
| 20 | **Administrar chequeos**   | <p>Permite	mostrar	los	distintos chequeos realizados a cada cliente en</p><p>una visita a terreno, y permite agregar uno nuevo, y cambiar su estado.</p>                                             | Administrativo                                      |

En el ejercicio del día anterior, se creó un proyecto Spring MVC, con tres controladores, cada uno asociado a los
siguientes casos de uso:

- Inicio
- Contacto
- Crear Capacitación

Como parte de este ejercicio se pide realizar lo siguiente:

1. Dentro del controlador de Capacitaciones, incluya un método asociado al caso de uso Listar Capacitaciones. Este
   método debe desplegar

` `la vista creada en ejercicios anteriores a través de un archivo JSP.

1. Tanto para el caso actual como para los anteriores, debe incluir estilos CSS. Puede basarse en el mismo estilo de
   días anteriores, y debe

` `ser un único archivo.

1. En caso de que alguna de las interfaces anteriores tenga asociada alguna validación o acción proveniente de
   JavaScript, debe implementarla.
1. Pruebe la aplicación y verifique que todo está en orden.

El entregable debe ser un archivo RAR o ZIP con el contenido asociado al proyecto.

| **Nota 1:** No es necesario que la plataforma se conecte a una base de datos Oracle; solo debe desplegar la interfaz respectiva. Esta vez con CSS y JS incorporados.                                                                                                                                                                                                                                                                                                                                                                                                 |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| El Datos de apoyo al planteamiento                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| <p></p><p>**Ejecución**: Grupal (equipo de no más 4 personas)</p><p></p><p>**Componentes para evaluar**: Se deberá entregar un archivo RAR o ZIP con el proyecto comprimido.</p>                                                                                                                                                                                                                                                                                                                                                                                     |
| Preguntas guía:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
|                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| Recursos Bibliográficos:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| <p></p><p>**Spring MVC: Configuración**</p><p><https://www.javatutoriales.com/2015/12/spring-mvc-parte-1-configuracion.html></p><p></p><p>**Introducción a MVC en Spring**</p><p><http://www.jtech.ua.es/j2ee/publico/spring-2012-13/sesion03-apuntes.html></p><p></p><p>**Crear un proyecto MVC con Spring Tool Suite (STS)**</p><p><https://www.youtube.com/watch?v=eMG9qi061D8></p><p></p><p>**Spring MVC - Cómo incluir archivos CSS o JS en una página JSP**</p><p><https://mkyong.com/spring-mvc/spring-mvc-how-to-include-js-or-css-files-in-a-jsp-page/></p> |



![Static Badge](https://img.shields.io/badge/Ejercicio%20Grupal%203.1%20-%20rose?labelColor=abcdef&cacheSeconds=3200)![Static Badge](https://img.shields.io/badge/Modulo%206%20-red?labelColor=abcdef&cacheSeconds=3200)



## **Integrantes :**
<table>
  <tr>
    <td><img src="https://img.shields.io/badge/Angelica%20-%20Romero%20-%20violet?cacheSeconds=3200" alt="Texto alternativo 1"></td>
    <td><img src="https://img.shields.io/badge/Bastian%20-%20Mariangel%20-%20red?cacheSeconds=3200" alt="Texto alternativo 2"></td>
    <td><img src="https://img.shields.io/badge/Ivan%20-%20Mieres%20-%20green?cacheSeconds=3200" alt="Texto alternativo 2"></td>
    <td><img src="https://img.shields.io/badge/Patricio%20-%20Bonnin%20-%20brown?cacheSeconds=3200" alt="Texto alternativo 2"></td>
    <td><img src="https://img.shields.io/badge/Roberto%20-%20Rivas%20-%20blue?cacheSeconds=3200" alt="Texto alternativo 2"></td>
  </tr>
</table>

![image](https://github.com/RobertoRivasL/Ejercicio_Grupal_3.1_Modulo_6/assets/131497718/10fc647d-d54f-4bea-9d1e-6bff5f521809)
![image](https://github.com/RobertoRivasL/Ejercicio_Grupal_3.1_Modulo_6/assets/131497718/323b7cfd-d830-483f-b7e5-703a543318be)
![image](https://github.com/RobertoRivasL/Ejercicio_Grupal_3.1_Modulo_6/assets/131497718/789e3a8a-6375-44ef-ada1-a516735c98c7)
![image](https://github.com/RobertoRivasL/Ejercicio_Grupal_3.1_Modulo_6/assets/131497718/6a818c1c-34cc-4a7d-8cdf-1a9e047a3f02)
![image](https://github.com/RobertoRivasL/Ejercicio_Grupal_3.1_Modulo_6/assets/131497718/c7576872-c550-43c4-8627-144facc63334)
![image](https://github.com/RobertoRivasL/Ejercicio_Grupal_3.1_Modulo_6/assets/131497718/5cbd5056-7b32-4f02-8f3c-de900fc25b8a)
![image](https://github.com/RobertoRivasL/Ejercicio_Grupal_3.1_Modulo_6/assets/131497718/ef37e09f-e5f1-487a-9ff1-1f1d264c93ed)






