// JavaScript Document
self.onmessage = function (ev) {
    if (ev.data % 2 == 0) {
        self.postMessage("偶数");
    } else {
        self.postMessage("奇数");
    }
    self.close();
}