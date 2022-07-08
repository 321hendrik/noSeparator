# Choose Bugfix approach

* Status: accepted
* Deciders: Hendrik Haas
* Date: 2022-07-08

Technical Story: -

## Context and Problem Statement

We need to remove the separator lines between cells of a TableView on android. This enables us to implement more customized table designs.

## Decision Drivers

* Time to deliver a solution
* Easy usability of the product
* Maintainability
* Stability considering future updates of the underlying SDK

## Considered Options

* Titanium Module for android
* Workaround

## Decision Outcome

Chosen option: "Titanium Module for android", because the time invested is not wasted, because we know there is a native solution to our problem

### Positive Consequences

* More custom table designs can be implemented
* Native android SDK knowledge is gathered

### Negative Consequences

* Native module has to be maintained when some native API change breaks it

## Pros and Cons of the Options

### Titanium Module for android

A native module accessing android tableview features

* Good, because Stable for future SDK updates
* Good, because Clean solution
* Good, because More customizable
* Bad, because It takes time to get into the native APIs

### Workaround

Hacky fix with view overlays, negative position values or matching background color

* Good, because fast
* Good, because easy
* Bad, because there could be no workaround
* Bad, because SDK updates could break the workaround
* Bad, because time to implement could be lost, if this doesn't work for some use cases
