const button = document.querySelector('.button');

button.addEventListener("click", () => {

    const form = document.querySelector('#recurringForm');
    const formData = new FormData(form);

    let data = {};
    for (let [key, value] of formData) {
        data[key] = value;
    }
    console.log(data);

    $.ajax({
        type: 'POST',
        url: '/api/v1/recurring',
        dataType: 'json',
        contentType: 'application/json; charset=utf-8',
        data: JSON.stringify(data)
    }).done(function (result) {
        console.log(result);

        result.forEach(arguments => {
           console.log(arguments.fieldName);
           console.log(arguments.className);
           console.log(arguments.resultMessage);
           if(arguments.className === 'Pattern') {
               document.querySelector('input[name="' + arguments.fieldName + '"]').value = "";
           }


        });

    }).fail(function (error) {
        console.log(error);
        console.log(error.responseJSON);
    });
});