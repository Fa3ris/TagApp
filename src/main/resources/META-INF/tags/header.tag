<%@ attribute name="message" description="Le message à afficher" %>
<%@ taglib prefix="tagapp" uri="fr.cbox.poc.tagapp" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <tagapp:header-css/>
</head>
<body>
	<tagapp:headertag/>
    <h1> lala je suis un header</h1>
    <p>${message}</p>
</body>
</html>