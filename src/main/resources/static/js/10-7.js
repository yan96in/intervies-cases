// JavaScript Document
self.onmessage = function (ev) {
    var strRetHTML = "<span><b>";
    strRetHTML += ev.data + "</b>位随机数为:<b> ";
    strRetHTML += RetRndNum(ev.data);
    strRetHTML += " </b></span><br>";
    self.postMessage(strRetHTML);

}

function RetRndNum(n) {
    var strRnd = "";
    for (var intI = 0; intI < n; intI++) {
        strRnd += Math.floor(Math.random() * 10);
    }
    return strRnd;
}