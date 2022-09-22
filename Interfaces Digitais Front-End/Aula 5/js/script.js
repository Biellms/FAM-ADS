let counter = 0;
let timeout;
let timer_on = 0;

function timedCount() {
  document.getElementById("span").innerText = counter;
  counter++;
  timeout = setTimeout(timedCount, 500);
}

function startCount() {
  if (!timer_on) {
    timer_on = 1;
    timedCount();
  } else {
    clearTimeout(timeout);
    timedCount();
  }
}

function timedLessCount() {
    document.getElementById("span").innerText = counter;
    counter--;
    timeout = setTimeout(timedLessCount, 500);
  }
  
  function lessCount() {
    if (!timer_on) {
      timer_on = 1;
      timedLessCount();
    } else {
        clearTimeout(timeout);
        timedLessCount();
      }
  }

function stopCount() {
  clearTimeout(timeout);
  timer_on = 0;
}

function restartCount() {
    clearTimeout(timeout)
    counter = 0;
    timer_on = 0;
    document.getElementById("span").innerText = counter;
}