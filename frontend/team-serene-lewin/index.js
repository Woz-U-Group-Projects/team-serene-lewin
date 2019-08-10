import React from 'react';
import ReactDom from 'react-dom';

const App = props => {
    const Sides = [
        'Tossed House Salad',
        'Rice Saffrons',
        'Brown Rice',
        'Salad-House',
        'Salad-Deli Scoop',
        'Salad-Deli(8 oz.)',
        'Salad-Deli(16 oz.)',
        'Flatbread',
        'Hummus'

    ];

    return <list Sides={Sides} />;
};

const List = props => {
    const listSides = props.Sides.map((Side, index) => (
        <li key={index}>{sides}</li>
    ));
    return <ul>(listSides)</ul>;
}

ReactDom.render(<App />, document.getElementById('root'));