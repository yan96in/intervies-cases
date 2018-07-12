// JavaScript Document
self.onmessage = function (ev) {
    var intLen=ev.data;
    var LngRndNum=RetRndNum(intLen);
    //FIXME: Worker is not defined at self.onmessage
    var objWorker=new Worker('10-9-1.js');
    objWorker.postMessage(LngRndNum);
    objWorker.onmessage=function (ev2) {
        var strRetHTML = "<span><b>";
        strRetHTML += intLen + "</b>位随机数为:<b> ";
        strRetHTML += LngRndNum;
        strRetHTML += " </b></span><br>";
        self.postMessage(strRetHTML);
    }


}

function RetRndNum(n) {
    var strRnd = "";
    for (var intI = 0; intI < n; intI++) {
        strRnd += Math.floor(Math.random() * 10);
    }
    return strRnd;
}