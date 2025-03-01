# rn-system-navigation [Only for Android]

It is a React Native package

## Installation

```sh
npm install rn-system-navigation
```

## Usage

```js
import {
  hideSystemNavigation,
  showSystemNavigation,
} from 'rn-system-navigation';

// ...

const btnHidePress = () => {
  const result = hideSystemNavigation();
  // It will return a boolean value (true or false)
};

const btnShowPress = () => {
  const result = showSystemNavigation();
  // It will return a boolean value (true or false)
};
```

## For complete use

See [example](./example/src/App.tsx) for complete tutorial on, how to use this library

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)

