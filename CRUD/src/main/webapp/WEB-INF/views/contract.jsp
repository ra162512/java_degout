<%-- 
    Document   : contract
    Created on : 7 avr. 2018, 15:49:09
    Author     : 06528
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body onload="load();">
        Veuillez remplir votre contrat :)
        <br/>
        <input type="hidden" id="user_id">
        Name: <input type="text" id="name" required="required" name="user_name"><br>
        Email: <input type="email" id="email" required="required" name="email"><br>
        begDate: <input type="date" id="begDate" required="required" name="begDate"><br>
        endDate: <input type="date" id="endDate" required="required" name="endDate"><br>
        Type: <input type="text" id="type" required="required" name="type"><br>
        phone: <input type="tel" id="tel" required="required" name="tel"><br>
        <button onclick="submit();">Submit</button>
     
        <script type="text/javascript">
   data = "";
    submit = function(){
          
            $.ajax({
                url:'saveOrUpdate',
                type:'POST',
                data:{user_name:$('#name').val(),begDate:$('#begDate').val(),endDate:$('#endDate').val(),type:$('#type').val(),phone:$('#phone').val()},
                success: function(response){
                        alert(response.message);
                        load();    
                }              
            });        
    }
        
    load = function(){ 
        $.ajax({
            url:'list',
            type:'POST',
            success: function(response){
                    data = response.data;
                    $('.tr').remove();
                    for(i=0; i<response.data.length; i++){                  
                        $("#table").append("<tr class='tr'> <td> "+response.data[i].user_name+" </td> <td> "+response.data[i].email+" </td> <td> <a href='#' onclick= edit("+i+");> Edit </a>  </td> </td> <td> <a href='#' onclick='delete_("+response.data[i].user_id+");'> Delete </a>  </td> </tr>");
                    }          
            }              
        });
         
    }
         
    </script>
        
        
        
        
        
    </body>
</html>

