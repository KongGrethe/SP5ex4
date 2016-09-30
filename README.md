Explain the term REST and the architectural Requirements that relates to REST
	"Representational state transfer"
	REST-compliant web services allow requesting systems to access and manipulate textual representations of web resources using a uniform and predefined set of stateless operations.
	The idea is that the best way to share large amounts of data between multiple parties is to make that data available on-demand by sharing references to that data rather than a complete copy of the data itself. Systems which implement REST are called 'RESTful' systems.

Elaborate on how JSON or XML supports communication between subsystems, even when the subsystems are implemented on different platforms:
    *JSON and XML is basically just formated plain-text. It is not platform specific and therefore any system that receives this format can work with it.
    The strength is that the implementation on the server side is irrelevant when what is being communicated from client-server is JSON/XML. 
    The webservice can have been made in Java, C#, C++, Python and so on and still function as long as we use JSON or XML when parsing data from
    client-server.