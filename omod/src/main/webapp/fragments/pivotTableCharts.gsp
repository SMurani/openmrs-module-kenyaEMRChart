<div>
    <table>
        <tr>
            <td>Name</td>
            <td>Population</td>
            <td>Safety</td>
            <td>Average</td>
        </tr>
        <%def Population =Population;%>
        <g:each in="${population}" var="population">
            <tr>
                <td>${population.name}</td>
                <td>${population.population}</td>
                <td>${population.safety}</td>
                <td>${population.averageAge}</td>
            </tr>
        </g:each>
    </table>
</div>


