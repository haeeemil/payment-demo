const button = document.querySelector('.button');

button.addEventListener("click", () => {

    let data = {
        cardNumber1: 'yes',
        cardNumber2: 'yes',
        cardNumber3: '',
        cardNumber4: 'yes'
    }

    $.ajax({
        type: 'POST',
        url: '/api/v1/recurring',
        dataType: 'json',
        contentType: 'application/json; charset=utf-8',
        data: JSON.stringify(data)
    }).done(function (elem) {
        if(elem.isSuccess){
            console.log(elem);
        } else {
          console.log(elem.message);
        }
    }).fail(function (error) {
        console.log(error);
    });
});