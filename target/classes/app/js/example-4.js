app.example4 = function () {
    $.get('/employees', function (data) {
        data.forEach(function(employee){
            $('#example-4').append('<div>'+employee.name+'</div>');
        });        
    });
}