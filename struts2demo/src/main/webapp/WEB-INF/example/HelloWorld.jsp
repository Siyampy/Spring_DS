<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title><s:text name="HelloWorld.message"/></title>
</head>

<body>
<h2><s:property value="message"/></h2>

<h3>Languages</h3>
<ul>
    <li>
        <s:url var="url" action="HelloWorld">
            <s:param name="request_locale">en</s:param>
        </s:url>
        <s:a href="%{url}">English</s:a>
    </li>
    <li>
        <s:url var="url" action="HelloWorld">
          
        </s:url>
        
        <s:a href="%{url}">English Mine Same page customized</s:a>
    </li>
    <li>
        <s:url var="url" action="HelloWorld">
            <s:param name="request_locale">es</s:param>
        </s:url>
        <s:a href="%{url}">Espanol</s:a>
    </li>
</ul>
<p>Get your own personal hello by filling out and submitting this form.</p>

<s:form action="HelloWorld">
  <s:textfield name="userName" label="Your name" />
  <s:submit value="Submit" />
</s:form>
</body>
</html>
