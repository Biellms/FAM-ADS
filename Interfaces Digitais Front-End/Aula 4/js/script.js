class Hello {

    constructor() {
        this.total = 0;
    }

    helloWorld() {
        let container = document.createElement('div')
        let div = document.createElement('div')
        let h1 = document.createElement('h1')
    
        container.setAttribute('id', 'container')
        container.className = 'container'
        div.className = 'box'
        h1.className = 'text'
    
        container.appendChild(div)
        div.appendChild(h1)
        h1.innerText = 'Hello World JavaScript'

        this.total += 1;

        document.getElementById('total').innerText = this.total;

        document.getElementById('body').appendChild(container);
        document.getElementById('botaoHello').setAttribute('onclick', 'hello.botaoAdd()');
    }

    botaoAdd() {
        let div = document.createElement('div')
        let h1 = document.createElement('h1')

        div.className = 'box'
        h1.className = 'text'

        this.total += 1;

        document.getElementById('total').innerText = this.total;

        div.appendChild(h1)
        h1.innerText = 'Hello World JavaScript'

        document.getElementById('container').appendChild(div);
    }

    remover() {
        let container = document.getElementById('container')

        if (this.total > 0) {
            this.total -= 1;
        }

        document.getElementById('total').innerText = this.total;

        container.removeChild(container.firstElementChild);
    }

    removerTudo() {
        let container = document.getElementById('container')

        document.getElementById('total').innerText = this.total;

        while (container.hasChildNodes) {
            this.remover()
        }
    }
}

var hello = new Hello;

document.getElementById('total').style.color = 'white';