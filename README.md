# ThymeleafExample
---

This project is used to demonstrate the **'Thymeleaf'** using SpringBoot.

To used the Thymeleaf template on html page, we have to modifty the following html tag.

```
<html lang="en" xmlns:th="http://www.thymeleaf.org">

```

#### The following are the thymeleaf tags and its syntax used on the projects.

1. `th:text="${variable_name}"` is used to add the value of variable.

2. `th:with="var_name=value, ...` is used to defined new input variable on `with` scope.

3. `${variable_1 + variable_2}` is used to perform arithmetic operation.

4. `th:style="css-style expression here...."` is used to add css style to html tag.

5. **Loops**

- `th:each="variable_name: ${arrays or list or set variable name}"` is used iterate over arrays, list or set.
- `th:each="item, iterStat : ${items}"` is used to iterate over collection.

    `iterStat` variable holds the status information for the current iteration, such as item index, or item is odd or even, etc.

    For examples,
    
    1.
    
    ```
    <ul>
    	<li th:each="n, status : ${names}">
    		<span th:text="${status.index+1} +' ' + ${n}"></span>
    	</li>
    </ul>
    ```
    
    2.
    
    ```
    <ul>
    	<li th:each="n, status : ${names}">
    		<span th:style="${status.odd} ?  'font-weight:bold' : ' ' " th:text="${status.index+1} +' ' + ${n}"></span>
    	</li>
    </ul>
    ```			
6. **Elvis Operator** (means `ternary operator`)
    
Example, 

```
<span th:style="${isActive}?'color:green' : 'color:red'" th:text="${isActive} ? 'Active' : 'Inactive'">
```

7. **If-unless** condition

Example,

```
<h2 th:if="${gender} == 'M'">Male</h2>
<h2 th:unless="${gender} == 'M'">Female</h2>
```

8. **Switch-Case** condition

Example,

```
<div th:switch="${#lists.size(myList)}">
	<h1 th:case="0">List Contains Zero Elements</h1>
	<h1 th:case="1">List Contains One Elements</h1>
	<h1 th:case="*">List Contains More than One Elements</h1> <!-- default case -->
</div>
```

9. `th:fragment="title_name"` is used to give the external web content on different html page. Generally, it is being used for adding footer content on any html page.

10. `th:fragment="title_name(var1,....)"` it can used to receive the dynamic content details on the fragment page.

11.  To called the above fragment content on web page, we can used **`th:replace`**, **`th:include`** and **`th:insert`** expression on that web page. 
    
**Syntax**,

```
th:replace="web_page_name::fragment_name"
```

Where, `web_page_name` is name of web page in which fragment content expression is defined.

and `fragment_name` is the name of fragment defined on that page.

12. `th:href` is used to specify the external file links.

Example,

```
<link rel="stylesheet" th:href="@{/style.css}" />
```


#### There are few in-build the functions of Thymeleaf template used in this project.

1. `${#strings.toUpperCase(var_name)}` is used the convert input string into upper case. 

2. `${#strings.length(var_name)}` is used to give length of input string.

3. `${#lists.size(items)}` is used to give the size on input `List` or `Set`.


#### How to include CSS, JS, and Image files using Thymeleaf

Examples,

1. **CSS**

```
<link rel="stylesheet" th:href="@{/css/mystyle.css}" />
```

2. **Image**

```
<img src="" class="profile" th:src="@{/image/Screenshot-1.png}" alt="" />
```

3. **JS**

```
<script src="" th:src="@{/js/myjs.js}"></script>
```

### Result

To view the project results, then click below link.

[To see the result screenshot](Result.md)







