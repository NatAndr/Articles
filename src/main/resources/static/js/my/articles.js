/**
 * Created by natal on 10-Jul-17.
 */
$(document).ready( function () {
    getArticleTypeList();
} );

function getArticleTypeList() {
    $.ajax({
        type: "POST",
        url: typeList,
        success: function (obj) {
            createArticleTypeGroup(obj, 'dynamicInput');
        },
        error: function (e) {
            alert('Error: ' + e);
        }
    });
}

function createArticleTypeGroup(values, divName) {
    var select = $('<select name="options" class="form-control options"></select>');
    $("#" + divName).html("");
    select.append('<option value="" disabled selected>Select article type</option>');
    $.each(values, function (i, obj) {
        var option = $('<option></option>');
        option.attr('value', obj.id);
        option.text(obj.name);
        select.append(option);
    });
    $("#" + divName).append(select);
}
