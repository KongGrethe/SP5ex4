/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $("#btnFetch").click(function() {
        fetch();
    });
});


function fetch() {
    var tmpID = $("#maxID").val();
    var filter = $("#filter").val();
    
    var url = "api/addresses/"+tmpID+"/" + filter;
    
    $.get(url, null, function (data) {
        var builtstring = "";
        $.each(data, function (index, val) {
            builtstring += "<tr>";
            
            if(val.fname !== undefined) {
                builtstring += "<td>" + val.fname + "</td>";
            }
            if(val.lname !== undefined) {
                builtstring += "<td>" + val.lname + "</td>";
            }
            if(val.street !== undefined) {
                builtstring += "<td>" + val.street + "</td>";
            }
            if(val.city !== undefined) {
                builtstring += "<td>" + val.city + "</td>";
            }
            
            builtstring + "</tr>";
        });
        $("#datatable").html(builtstring);
    });
}