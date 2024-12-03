
// Clear input and output fields
function clearInput() {
    document.getElementById('input').value = '';
    document.getElementById('output').innerText = '';
}

// Function to calculate Mean
function calculateMean() {
    let input = document.getElementById('input').value;
    let values = input.split(',').map(num => parseFloat(num.trim()));

    fetch('/api/calculator/mean', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(values)
    })
        .then(response => response.json())
        .then(data => {
            document.getElementById('output').innerText = 'Mean: ' + data.result;
        });
}

// Function to calculate Standard Deviation (Population or Sample)
function calculateStandardDeviation(isPopulation) {
    let input = document.getElementById('input').value;
    let values = input.split(',').map(num => parseFloat(num.trim()));

    fetch(`/api/calculator/standardDeviation?isPopulation=${isPopulation}`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(values)
    })
        .then(response => response.json())
        .then(data => {
            document.getElementById('output').innerText = (isPopulation ? 'Population' : 'Sample') + ' Standard Deviation: ' + data.result;
        });
}

// Function to calculate Regression
function calculateRegression() {
    let input = document.getElementById('input').value;
    let pairs = input.split(';').map(pair => pair.split(',').map(num => parseFloat(num.trim())));
    let xValues = pairs.map(pair => pair[0]);
    let yValues = pairs.map(pair => pair[1]);

    fetch('/api/calculator/regression', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ xValues, yValues })
    })
        .then(response => response.json())
        .then(data => {
            document.getElementById('output').innerText = `Regression Formula: y = ${data[0]}x + ${data[1]}`;
        });
}

// Function to predict Y based on the regression formula
function predictY() {
    let input = document.getElementById('input').value;
    let [x, slope, intercept] = input.split(',').map(num => parseFloat(num.trim()));

    fetch(`/api/calculator/predict?x=${x}&slope=${slope}&intercept=${intercept}`)
        .then(response => response.json())
        .then(data => {
            document.getElementById('output').innerText = 'Predicted Y Value: ' + data.result;
        });
}
