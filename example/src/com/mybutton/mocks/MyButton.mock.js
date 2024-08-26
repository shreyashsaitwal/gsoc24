Mock.template = () => {
    return `<button id="m3-button">Click me!</button>`;
}

Mock.onPropertyChange = (property) => {
    const btn = Mock.document.getElementById('m3-button');
    switch (property.name) {
        case 'Text':
            btn.textContent = property.value;
            break;
        case 'TextFontSize':
            btn.style.fontSize = property.value + 'px';
            break;
        case 'TextColor':
            btn.style.color = property.value;
            break;
        case 'TextFontFamily':
            btn.style.fontFamily = property.value;
            break;
        case 'BackgroundColor':
            btn.style.backgroundColor = property.value;
            break;
        case 'BorderColor':
            if (btn.style.border === '#FFFFFF00') {
                btn.style.border = 'none';
            } else {
                btn.style.border = '2px solid ' + property.value;
            }
            break;
        case 'Height':
            btn.style.height = property.value;
            break;
        case 'Width':
            btn.style.width = property.value;
            break;
        default:
            break;
    }
}
